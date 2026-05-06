package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DropperLine: ImageVector
    get() {
        if (_dropperLine != null) return _dropperLine!!
        _dropperLine = remixIcon(
            name = "DropperLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.778 4.222c.781 .781 .781 2.047 0 2.828L16.95 9.878 14.121 7.05 16.95 4.222c.781-.781 2.047-.781 2.828 0ZM21.192 2.807c-1.562-1.562-4.095-1.562-5.657 0L12.707 5.636l-.354-.353c-.391-.391-1.024-.391-1.414 0-.39 .391-.39 1.024 0 1.414l.354 .354L5.078 13.265c-.558 .558-.939 1.27-1.094 2.044l-.351 1.754c-.077 .387-.268 .743-.547 1.022l-.986 .986c-.391 .39-.391 1.024 0 1.414l1.414 1.414c.391 .39 1.024 .39 1.414 0l.986-.986c.279-.279 .635-.469 1.022-.547l1.754-.351c.774-.155 1.486-.535 2.044-1.094l6.215-6.215 .354 .353c.39 .391 1.024 .391 1.414 0 .39-.391 .39-1.024 0-1.414l-.354-.353L21.192 8.464c1.562-1.562 1.562-4.095 0-5.657ZM12.707 8.465l2.828 2.828L9.321 17.508c-.279 .279-.635 .47-1.022 .547l-1.754 .351c-.774 .155-1.486 .535-2.044 1.094 .558-.558 .939-1.27 1.094-2.044l.351-1.754c.077-.387 .268-.743 .547-1.022L12.707 8.465Z"),
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
        return _dropperLine!!
    }

private var _dropperLine: ImageVector? = null
