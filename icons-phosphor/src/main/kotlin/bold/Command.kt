package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = phosphorBoldIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 140.000 L 164.000 140.000 L 164.000 116.000 L 180.000 116.000 C 202.091 116.000 220.000 98.091 220.000 76.000 C 220.000 53.909 202.091 36.000 180.000 36.000 C 157.909 36.000 140.000 53.909 140.000 76.000 L 140.000 92.000 L 116.000 92.000 L 116.000 76.000 C 116.000 53.909 98.091 36.000 76.000 36.000 C 53.909 36.000 36.000 53.909 36.000 76.000 C 36.000 98.091 53.909 116.000 76.000 116.000 L 92.000 116.000 L 92.000 140.000 L 76.000 140.000 C 53.909 140.000 36.000 157.909 36.000 180.000 C 36.000 202.091 53.909 220.000 76.000 220.000 C 98.091 220.000 116.000 202.091 116.000 180.000 L 116.000 164.000 L 140.000 164.000 L 140.000 180.000 C 140.000 202.091 157.909 220.000 180.000 220.000 C 202.091 220.000 220.000 202.091 220.000 180.000 C 220.000 157.909 202.091 140.000 180.000 140.000 ZM 164.000 76.000 C 164.000 67.163 171.163 60.000 180.000 60.000 C 188.837 60.000 196.000 67.163 196.000 76.000 C 196.000 84.837 188.837 92.000 180.000 92.000 L 164.000 92.000 ZM 60.000 76.000 C 60.000 67.163 67.163 60.000 76.000 60.000 C 84.837 60.000 92.000 67.163 92.000 76.000 L 92.000 92.000 L 76.000 92.000 C 67.163 92.000 60.000 84.837 60.000 76.000 ZM 92.000 180.000 C 92.000 188.837 84.837 196.000 76.000 196.000 C 67.163 196.000 60.000 188.837 60.000 180.000 C 60.000 171.163 67.163 164.000 76.000 164.000 L 92.000 164.000 ZM 116.000 116.000 L 140.000 116.000 L 140.000 140.000 L 116.000 140.000 ZM 180.000 196.000 C 171.163 196.000 164.000 188.837 164.000 180.000 L 164.000 164.000 L 180.000 164.000 C 188.837 164.000 196.000 171.163 196.000 180.000 C 196.000 188.837 188.837 196.000 180.000 196.000 Z"),
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
        return _command!!
    }

private var _command: ImageVector? = null
