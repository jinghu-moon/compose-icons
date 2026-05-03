package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Paragraph: ImageVector
    get() {
        if (_paragraph != null) return _paragraph!!
        _paragraph = phosphorThinIcon(
            name = "Paragraph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 44.000 L 96.000 44.000 C 62.863 44.000 36.000 70.863 36.000 104.000 C 36.000 137.137 62.863 164.000 96.000 164.000 L 140.000 164.000 L 140.000 208.000 C 140.000 210.209 141.791 212.000 144.000 212.000 C 146.209 212.000 148.000 210.209 148.000 208.000 L 148.000 52.000 L 180.000 52.000 L 180.000 208.000 C 180.000 210.209 181.791 212.000 184.000 212.000 C 186.209 212.000 188.000 210.209 188.000 208.000 L 188.000 52.000 L 208.000 52.000 C 210.209 52.000 212.000 50.209 212.000 48.000 C 212.000 45.791 210.209 44.000 208.000 44.000 ZM 140.000 156.000 L 96.000 156.000 C 67.281 156.000 44.000 132.719 44.000 104.000 C 44.000 75.281 67.281 52.000 96.000 52.000 L 140.000 52.000 Z"),
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
        return _paragraph!!
    }

private var _paragraph: ImageVector? = null
