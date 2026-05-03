package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DotsSixVertical: ImageVector
    get() {
        if (_dotsSixVertical != null) return _dotsSixVertical!!
        _dotsSixVertical = phosphorBoldIcon(
            name = "DotsSixVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 108.000 60.000 C 108.000 68.837 100.837 76.000 92.000 76.000 C 83.163 76.000 76.000 68.837 76.000 60.000 C 76.000 51.163 83.163 44.000 92.000 44.000 C 100.837 44.000 108.000 51.163 108.000 60.000 ZM 164.000 76.000 C 172.837 76.000 180.000 68.837 180.000 60.000 C 180.000 51.163 172.837 44.000 164.000 44.000 C 155.163 44.000 148.000 51.163 148.000 60.000 C 148.000 68.837 155.163 76.000 164.000 76.000 ZM 92.000 112.000 C 83.163 112.000 76.000 119.163 76.000 128.000 C 76.000 136.837 83.163 144.000 92.000 144.000 C 100.837 144.000 108.000 136.837 108.000 128.000 C 108.000 119.163 100.837 112.000 92.000 112.000 ZM 164.000 112.000 C 155.163 112.000 148.000 119.163 148.000 128.000 C 148.000 136.837 155.163 144.000 164.000 144.000 C 172.837 144.000 180.000 136.837 180.000 128.000 C 180.000 119.163 172.837 112.000 164.000 112.000 ZM 92.000 180.000 C 83.163 180.000 76.000 187.163 76.000 196.000 C 76.000 204.837 83.163 212.000 92.000 212.000 C 100.837 212.000 108.000 204.837 108.000 196.000 C 108.000 187.163 100.837 180.000 92.000 180.000 ZM 164.000 180.000 C 155.163 180.000 148.000 187.163 148.000 196.000 C 148.000 204.837 155.163 212.000 164.000 212.000 C 172.837 212.000 180.000 204.837 180.000 196.000 C 180.000 187.163 172.837 180.000 164.000 180.000 Z"),
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
        return _dotsSixVertical!!
    }

private var _dotsSixVertical: ImageVector? = null
