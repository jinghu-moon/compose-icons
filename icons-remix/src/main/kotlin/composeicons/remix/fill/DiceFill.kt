package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DiceFill: ImageVector
    get() {
        if (_diceFill != null) return _diceFill!!
        _diceFill = remixIcon(
            name = "DiceFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.998 1.58c.62-.359 1.384-.359 2.004 0l7.5 4.342c.618 .358 .998 1.017 .998 1.731v8.694c0 .714-.38 1.373-.998 1.731l-7.5 4.342c-.62 .359-1.384 .359-2.004 0L3.498 18.078c-.618-.358-.998-1.017-.998-1.731v-8.694c0-.714 .38-1.373 .998-1.731L10.998 1.58ZM5.251 8.092c-.333-.193-.751 .048-.751 .433v6.669c0 .714 .38 1.373 .998 1.731l5.752 3.33c.333 .193 .75-.047 .75-.433v-6.669c0-.714-.38-1.373-.998-1.731L5.251 8.092ZM15.768 5.517c-.478-.276-1.254-.276-1.732 0-.478 .276-.478 .724 0 1 .478 .276 1.254 .276 1.732 0 .478-.276 .478-.724 0-1ZM9.968 5.517c-.478-.276-1.254-.276-1.732 0-.478 .276-.478 .724 0 1 .478 .276 1.254 .276 1.732 0 .478-.276 .478-.724 0-1ZM16.993 15.845c.598-.345 1.082-1.185 1.083-1.875 0-.69-.485-.97-1.082-.625-.598 .345-1.082 1.185-1.082 1.875 0 .69 .485 .97 1.082 .625ZM6.366 12.2c.478 .276 .866 .052 .866-.5-0-.552-.388-1.224-.866-1.5-.478-.276-.866-.052-.866 .5 0 .552 .388 1.224 .866 1.5ZM10.695 17.698c0 .552-.388 .776-.866 .5-.478-.276-.866-.948-.866-1.5-0-.552 .388-.776 .866-.5 .478 .276 .866 .948 .866 1.5ZM7.232 15.699c0 .552-.388 .776-.866 .5-.478-.276-.866-.948-.866-1.5-0-.552 .388-.776 .866-.5 .478 .276 .866 .948 .866 1.5ZM10.695 13.7c0 .552-.388 .776-.866 .5-.478-.276-.866-.948-.866-1.5-0-.552 .388-.776 .866-.5 .478 .276 .866 .948 .866 1.5Z"),
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
        return _diceFill!!
    }

private var _diceFill: ImageVector? = null
