package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) return _phoneCall!!
        _phoneCall = lucideOutlineIcon(
            name = "PhoneCall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 2.000 C 17.971 2.000 22.000 6.029 22.000 11.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 13.000 6.000 C 15.761 6.000 18.000 8.239 18.000 11.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 13.832 16.568 C 14.257 16.763 14.761 16.637 15.045 16.265 L 15.400 15.800 C 15.778 15.296 16.370 15.000 17.000 15.000 L 20.000 15.000 C 21.105 15.000 22.000 15.895 22.000 17.000 L 22.000 20.000 C 22.000 21.105 21.105 22.000 20.000 22.000 C 10.059 22.000 2.000 13.941 2.000 4.000 C 2.000 2.895 2.895 2.000 4.000 2.000 L 7.000 2.000 C 8.105 2.000 9.000 2.895 9.000 4.000 L 9.000 7.000 C 9.000 7.630 8.704 8.222 8.200 8.600 L 7.732 8.951 C 7.353 9.240 7.231 9.756 7.440 10.184 C 8.807 12.960 11.054 15.205 13.832 16.568"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
