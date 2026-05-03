package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DotsSix: ImageVector
    get() {
        if (_dotsSix != null) return _dotsSix!!
        _dotsSix = phosphorBoldIcon(
            name = "DotsSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 76.000 92.000 C 76.000 100.837 68.837 108.000 60.000 108.000 C 51.163 108.000 44.000 100.837 44.000 92.000 C 44.000 83.163 51.163 76.000 60.000 76.000 C 68.837 76.000 76.000 83.163 76.000 92.000 ZM 128.000 76.000 C 119.163 76.000 112.000 83.163 112.000 92.000 C 112.000 100.837 119.163 108.000 128.000 108.000 C 136.837 108.000 144.000 100.837 144.000 92.000 C 144.000 83.163 136.837 76.000 128.000 76.000 ZM 196.000 108.000 C 204.837 108.000 212.000 100.837 212.000 92.000 C 212.000 83.163 204.837 76.000 196.000 76.000 C 187.163 76.000 180.000 83.163 180.000 92.000 C 180.000 100.837 187.163 108.000 196.000 108.000 ZM 60.000 148.000 C 51.163 148.000 44.000 155.163 44.000 164.000 C 44.000 172.837 51.163 180.000 60.000 180.000 C 68.837 180.000 76.000 172.837 76.000 164.000 C 76.000 155.163 68.837 148.000 60.000 148.000 ZM 128.000 148.000 C 119.163 148.000 112.000 155.163 112.000 164.000 C 112.000 172.837 119.163 180.000 128.000 180.000 C 136.837 180.000 144.000 172.837 144.000 164.000 C 144.000 155.163 136.837 148.000 128.000 148.000 ZM 196.000 148.000 C 187.163 148.000 180.000 155.163 180.000 164.000 C 180.000 172.837 187.163 180.000 196.000 180.000 C 204.837 180.000 212.000 172.837 212.000 164.000 C 212.000 155.163 204.837 148.000 196.000 148.000 Z"),
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
        return _dotsSix!!
    }

private var _dotsSix: ImageVector? = null
