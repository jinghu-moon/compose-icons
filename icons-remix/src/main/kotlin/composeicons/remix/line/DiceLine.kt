package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DiceLine: ImageVector
    get() {
        if (_diceLine != null) return _diceLine!!
        _diceLine = remixIcon(
            name = "DiceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.998 1.58c.62-.359 1.384-.359 2.004 0l7.5 4.342c.618 .358 .998 1.017 .998 1.731v8.694c0 .714-.38 1.373-.998 1.731l-7.5 4.342c-.62 .359-1.384 .359-2.004 0L3.498 18.078c-.618-.358-.998-1.017-.998-1.731v-8.694c0-.714 .38-1.373 .998-1.731L10.998 1.58ZM4.5 7.653v.005l6.502 3.764c.618 .358 .998 1.017 .998 1.731v7.536l7.5-4.342v-8.694L12 3.311 4.5 7.653ZM6.132 12.3c-0-.552-.388-1.224-.866-1.5-.478-.276-.866-.052-.866 .5 0 .552 .388 1.224 .866 1.5 .478 .276 .866 .052 .866-.5ZM8.729 18.798c.478 .276 .866 .052 .866-.5-0-.552-.388-1.224-.866-1.5-.478-.276-.866-.052-.866 .5 0 .552 .388 1.224 .866 1.5ZM5.266 16.799c.478 .276 .866 .052 .866-.5-0-.552-.388-1.224-.866-1.5-.478-.276-.866-.052-.866 .5 0 .552 .388 1.224 .866 1.5ZM8.729 14.8c.478 .276 .866 .052 .866-.5-0-.552-.388-1.224-.866-1.5-.478-.276-.866-.052-.866 .5 0 .552 .388 1.224 .866 1.5ZM14.898 8c.478-.276 .478-.724 0-1-.478-.276-1.254-.276-1.732 0-.478 .276-.478 .724 0 1 .478 .276 1.254 .276 1.732 0ZM10.098 7c.478 .276 .478 .724 0 1-.478 .276-1.254 .276-1.732 0-.478-.276-.478-.724 0-1 .478-.276 1.254-.276 1.732 0ZM15.995 15.349c.598-.345 1.082-1.185 1.082-1.875 0-.69-.485-.97-1.082-.625-.598 .345-1.082 1.185-1.082 1.875 0 .69 .485 .97 1.082 .625Z"),
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
        return _diceLine!!
    }

private var _diceLine: ImageVector? = null
