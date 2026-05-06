package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UserVoiceLine: ImageVector
    get() {
        if (_userVoiceLine != null) return _userVoiceLine!!
        _userVoiceLine = remixIcon(
            name = "UserVoiceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1 22C1 17.582 4.582 14 9 14c4.418 0 8 3.582 8 8h-2C15 18.686 12.314 16 9 16 5.686 16 3 18.686 3 22h-2ZM9 13C5.685 13 3 10.315 3 7c0-3.315 2.685-6 6-6 3.315 0 6 2.685 6 6C15 10.315 12.315 13 9 13ZM9 11c2.21 0 4-1.79 4-4 0-2.21-1.79-4-4-4-2.21 0-4 1.79-4 4C5 9.21 6.79 11 9 11ZM21.548 .784C22.477 2.657 23 4.767 23 7c0 2.233-.523 4.343-1.452 6.216L19.903 12.02C20.607 10.493 21 8.792 21 7 21 5.208 20.607 3.507 19.903 1.98L21.548 .784ZM18.246 3.185C18.732 4.36 19 5.649 19 7c0 1.351-.268 2.64-.754 3.815L16.569 9.596C16.848 8.782 17 7.909 17 7c0-.909-.152-1.782-.431-2.596L18.246 3.185Z"),
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
        return _userVoiceLine!!
    }

private var _userVoiceLine: ImageVector? = null
