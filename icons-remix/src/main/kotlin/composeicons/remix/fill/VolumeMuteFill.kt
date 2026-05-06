package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VolumeMuteFill: ImageVector
    get() {
        if (_volumeMuteFill != null) return _volumeMuteFill!!
        _volumeMuteFill = remixIcon(
            name = "VolumeMuteFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.889 16h-3.889c-.552 0-1-.448-1-1v-6c0-.552 .448-1 1-1h3.889L11.183 3.668c.214-.175 .529-.143 .704 .07 .073 .089 .113 .201 .113 .317v15.89c0 .276-.224 .5-.5 .5-.115 0-.227-.04-.317-.113L5.889 16ZM20.414 12l3.535 3.535-1.414 1.414L19 13.414l-3.535 3.536L14.05 15.536l3.536-3.535L14.05 8.465 15.465 7.05 19 10.586 22.535 7.05l1.414 1.414-3.535 3.536Z"),
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
        return _volumeMuteFill!!
    }

private var _volumeMuteFill: ImageVector? = null
