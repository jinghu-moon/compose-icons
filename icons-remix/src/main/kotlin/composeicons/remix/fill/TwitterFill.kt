package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TwitterFill: ImageVector
    get() {
        if (_twitterFill != null) return _twitterFill!!
        _twitterFill = remixIcon(
            name = "TwitterFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.212 5.656c-.763 .338-1.573 .559-2.402 .658 .873-.523 1.527-1.345 1.839-2.314-.821 .488-1.719 .831-2.656 1.015C18.203 4.171 17.098 3.693 15.942 3.694c-2.309 0-4.182 1.872-4.182 4.182 0 .328 .038 .646 .108 .952C8.39 8.654 5.31 6.99 3.247 4.459c-.371 .638-.567 1.364-.566 2.102 0 1.451 .739 2.732 1.86 3.481C3.877 10.022 3.228 9.843 2.647 9.52c-.001 .018-.001 .035-.001 .052 0 2.027 1.442 3.718 3.355 4.102-.359 .097-.73 .146-1.102 .146-.27 0-.533-.025-.787-.074 .533 1.661 2.076 2.871 3.907 2.904C6.538 17.812 4.709 18.443 2.825 18.44c-.333 0-.666-.019-.997-.059 1.912 1.229 4.137 1.881 6.41 1.879 7.693 0 11.9-6.373 11.9-11.899 0-.181-.004-.362-.012-.541 .819-.592 1.525-1.324 2.087-2.164Z"),
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
        return _twitterFill!!
    }

private var _twitterFill: ImageVector? = null
