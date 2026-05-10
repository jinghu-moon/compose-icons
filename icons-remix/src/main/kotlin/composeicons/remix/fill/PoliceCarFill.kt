package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PoliceCarFill: ImageVector
    get() {
        if (_policeCarFill != null) return _policeCarFill!!
        _policeCarFill = remixIcon(
            name = "PoliceCarFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 13.5v7.5c0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1v-1h-14v1c0 .552-.448 1-1 1h-1C2.448 22 2 21.552 2 21v-7.5L.757 13.189C.312 13.078 0 12.678 0 12.219v-.719C0 11.224 .224 11 .5 11h1.929L4.481 6.212C4.796 5.477 5.519 5 6.319 5h1.681v-2h3v2h2v-2h3v2h1.681c.8 0 1.523 .477 1.838 1.212L21.571 11h1.929c.276 0 .5 .224 .5 .5v.719c0 .459-.312 .859-.757 .97L22 13.5ZM4 15v2c0 .552 .448 1 1 1h3.245c.082 0 .163-.02 .236-.059 .243-.13 .335-.433 .205-.677h0C7.879 15.755 6.317 15 4 15ZM20 15c-2.317 0-3.879 .755-4.686 2.264h0c-.13 .243-.038 .546 .205 .677 .072 .039 .153 .059 .236 .059h3.245c.552 0 1-.448 1-1v-2ZM6 7 4.549 10.629c-.047 .118-.072 .244-.072 .371 0 .552 .448 1 1 1h13.046c.127 0 .253-.024 .371-.071 .513-.205 .762-.787 .557-1.3L18 7h-12Z"),
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
        return _policeCarFill!!
    }

private var _policeCarFill: ImageVector? = null
