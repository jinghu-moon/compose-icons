package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RoadsterFill: ImageVector
    get() {
        if (_roadsterFill != null) return _roadsterFill!!
        _roadsterFill = remixIcon(
            name = "RoadsterFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 13.5v7.5c0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1v-1h-14v1c0 .552-.448 1-1 1h-1C2.448 22 2 21.552 2 21v-7.5L.757 13.189C.312 13.078 0 12.678 0 12.219v-.719C0 11.224 .224 11 .5 11h1.875L4.513 5.298C4.806 4.517 5.552 4 6.386 4h11.228c.834 0 1.58 .517 1.873 1.298L21.625 11h1.875c.276 0 .5 .224 .5 .5v.719c0 .459-.312 .859-.757 .97L22 13.5ZM4 15v2c0 .552 .448 1 1 1h3.245c.082 0 .163-.02 .236-.059 .243-.13 .335-.433 .205-.677h0C7.879 15.755 6.317 15 4 15ZM20 15c-2.317 0-3.879 .755-4.686 2.264h0c-.13 .243-.038 .546 .205 .677 .072 .039 .153 .059 .236 .059h3.245c.552 0 1-.448 1-1v-2ZM6 6 4.439 10.684c-.034 .102-.051 .209-.051 .316 0 .552 .448 1 1 1h13.225c.108 0 .214-.017 .316-.051 .524-.175 .807-.741 .632-1.265L18 6h-12Z"),
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
        return _roadsterFill!!
    }

private var _roadsterFill: ImageVector? = null
