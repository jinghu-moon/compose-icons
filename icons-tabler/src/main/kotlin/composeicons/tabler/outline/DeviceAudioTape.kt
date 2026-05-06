package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceAudioTape: ImageVector
    get() {
        if (_deviceAudioTape != null) return _deviceAudioTape!!
        _deviceAudioTape = tablerOutlineIcon(
            name = "DeviceAudioTape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 7C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-14C3.895 19 3 18.105 3 17v-10"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M3 17 7 14h10l4 3"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M7 9.5c0 .276 .224 .5 .5 .5C7.776 10 8 9.776 8 9.5 8 9.224 7.776 9 7.5 9 7.224 9 7 9.224 7 9.5"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M16 9.5c0 .276 .224 .5 .5 .5 .276 0 .5-.224 .5-.5C17 9.224 16.776 9 16.5 9 16.224 9 16 9.224 16 9.5"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _deviceAudioTape!!
    }

private var _deviceAudioTape: ImageVector? = null
