package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EyeCloseFill: ImageVector
    get() {
        if (_eyeCloseFill != null) return _eyeCloseFill!!
        _eyeCloseFill = remixIcon(
            name = "EyeCloseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.13 15.842l-.788 2.94L7.411 18.264l.787-2.939C7.009 14.888 5.917 14.25 4.961 13.454L2.808 15.607 1.394 14.193 3.547 12.039C2.356 10.611 1.52 8.875 1.176 6.968l.901-.164c2.792 2.011 6.22 3.196 9.924 3.196 3.704 0 7.131-1.185 9.924-3.196l.901 .164c-.344 1.906-1.18 3.642-2.371 5.071l2.153 2.153-1.414 1.414L19.039 13.454c-.956 .797-2.048 1.434-3.237 1.872l.787 2.939-1.932 .518-.788-2.94c-.608 .104-1.232 .158-1.87 .158-.637 0-1.262-.054-1.87-.158Z"),
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
        return _eyeCloseFill!!
    }

private var _eyeCloseFill: ImageVector? = null
