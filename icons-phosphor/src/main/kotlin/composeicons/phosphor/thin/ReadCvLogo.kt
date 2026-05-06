package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ReadCvLogo: ImageVector
    get() {
        if (_readCvLogo != null) return _readCvLogo!!
        _readCvLogo = phosphorThinIcon(
            name = "ReadCvLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.09 43.19 79.84 20.19c-3.135-.555-6.362 .158-8.971 1.983-2.609 1.825-4.386 4.612-4.939 7.747L36.18 198.92c-1.15 6.525 3.206 12.747 9.73 13.9l130.26 23c.696 .128 1.402 .191 2.11 .19 5.814-.014 10.782-4.194 11.79-9.92L219.82 57.09c1.15-6.525-3.206-12.747-9.73-13.9ZM211.94 55.7 182.19 224.7c-.381 2.176-2.454 3.631-4.63 3.25l-130.26-23c-2.172-.386-3.621-2.457-3.24-4.63L73.81 31.32c.381-2.176 2.454-3.631 4.63-3.25l130.26 23c2.172 .386 3.621 2.457 3.24 4.63ZM184.14 75.17c-.339 1.906-1.994 3.296-3.93 3.3-.235-0-.469-.02-.7-.06L96.51 63.75c-2.176-.384-3.629-2.459-3.245-4.635 .384-2.176 2.459-3.629 4.635-3.245l83 14.66c1.045 .185 1.974 .778 2.582 1.649 .608 .87 .845 1.946 .658 2.991ZM178.6 106.68c-.335 1.914-1.997 3.31-3.94 3.31-.235 .001-.47-.022-.7-.07L91 95.27c-2.176-.384-3.629-2.459-3.245-4.635 .384-2.176 2.459-3.629 4.635-3.245l83 14.66c2.16 .4 3.593 2.467 3.21 4.63ZM131.6 130.87c-.339 1.91-2 3.301-3.94 3.3-.235-.001-.469-.021-.7-.06L85.47 126.78c-1.46-.19-2.697-1.167-3.221-2.543-.524-1.376-.25-2.928 .714-4.042 .964-1.113 2.461-1.607 3.898-1.286l41.49 7.32c2.164 .4 3.599 2.474 3.21 4.64Z"),
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
        return _readCvLogo!!
    }

private var _readCvLogo: ImageVector? = null
