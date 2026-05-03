package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MicVocal: ImageVector
    get() {
        if (_micVocal != null) return _micVocal!!
        _micVocal = lucideOutlineIcon(
            name = "MicVocal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 7.601 L 5.006 15.791 C 4.715 16.189 4.757 16.740 5.106 17.089 L 5.923 17.907 C 6.277 18.261 6.839 18.298 7.237 17.994 L 15.090 12.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 16.500 21.174 C 15.500 20.500 14.372 20.000 13.000 20.000 C 10.942 20.000 9.072 22.356 7.000 22.000 C 4.928 21.644 4.225 18.631 5.500 17.500"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 21.000 7.000 C 21.000 9.761 18.761 12.000 16.000 12.000 C 13.239 12.000 11.000 9.761 11.000 7.000 C 11.000 4.239 13.239 2.000 16.000 2.000 C 18.761 2.000 21.000 4.239 21.000 7.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _micVocal!!
    }

private var _micVocal: ImageVector? = null
