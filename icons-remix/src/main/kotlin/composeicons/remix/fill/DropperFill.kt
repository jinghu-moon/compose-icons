package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DropperFill: ImageVector
    get() {
        if (_dropperFill != null) return _dropperFill!!
        _dropperFill = remixIcon(
            name = "DropperFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.535 2.807c1.562-1.562 4.095-1.562 5.657 0 1.562 1.562 1.562 4.095 0 5.657l-2.829 2.829 .354 .354c.39 .391 .39 1.024 0 1.414-.391 .391-1.024 .391-1.414 0l-.354-.353-6.215 6.215c-.558 .558-1.27 .939-2.044 1.094l-1.754 .351c-.387 .078-.743 .268-1.022 .547l-.986 .986c-.391 .39-1.024 .39-1.414 0L2.101 20.486c-.391-.391-.391-1.024 0-1.414l.986-.986c.279-.279 .47-.635 .547-1.022l.351-1.754c.155-.774 .536-1.486 1.094-2.044L11.293 7.05l-.354-.354c-.39-.391-.39-1.024 0-1.414 .391-.391 1.024-.391 1.414 0l.353 .353L15.535 2.807ZM12.707 8.465 6.492 14.679c-.279 .279-.47 .635-.547 1.022l-.351 1.754c-.155 .774-.535 1.486-1.094 2.044 .558-.558 1.27-.939 2.044-1.094l1.754-.351c.387-.077 .743-.268 1.022-.547l6.215-6.215L12.707 8.465Z"),
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
        return _dropperFill!!
    }

private var _dropperFill: ImageVector? = null
