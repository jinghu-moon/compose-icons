package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ToteSimple: ImageVector
    get() {
        if (_toteSimple != null) return _toteSimple!!
        _toteSimple = phosphorBoldIcon(
            name = "ToteSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239 66.75C235.19 62.466 229.733 60.01 224 60h-44.17C177.641 32.999 155.09 12.201 128 12.201 100.91 12.201 78.359 32.999 76.17 60h-44.09c-5.727-.022-11.19 2.412-15.002 6.685-3.813 4.274-5.611 9.977-4.938 15.665L26.39 202.35c1.22 10.083 9.784 17.663 19.94 17.65h163.34c10.156 .013 18.72-7.567 19.94-17.65L243.86 82.35C244.535 76.695 242.767 71.021 239 66.75ZM128 36c13.918 .001 25.722 10.225 27.71 24h-55.42C102.278 46.225 114.082 36.001 128 36ZM206.19 196h-156.38L36.5 84h183Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _toteSimple!!
    }

private var _toteSimple: ImageVector? = null
