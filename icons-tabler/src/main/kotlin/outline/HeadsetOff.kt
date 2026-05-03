package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeadsetOff: ImageVector
    get() {
        if (_headsetOff != null) return _headsetOff!!
        _headsetOff = tablerOutlineIcon(
            name = "HeadsetOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 14.000 L 4.000 11.000 C 4.000 9.047 4.700 7.258 5.862 5.870M 8.044 4.045 C 10.521 2.636 13.560 2.651 16.023 4.083 C 18.486 5.516 20.001 8.151 20.000 11.000 L 20.000 14.000"),
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
                pathData = parseSvgPathData("M 18.000 19.000 C 18.000 20.657 15.314 22.000 12.000 22.000"),
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
                pathData = parseSvgPathData("M 4.000 14.000 C 4.000 12.895 4.895 12.000 6.000 12.000 L 7.000 12.000 C 8.105 12.000 9.000 12.895 9.000 14.000 L 9.000 17.000 C 9.000 18.105 8.105 19.000 7.000 19.000 L 6.000 19.000 C 4.895 19.000 4.000 18.105 4.000 17.000 L 4.000 14.000"),
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
                pathData = parseSvgPathData("M 16.169 12.180 C 16.422 12.065 16.703 12.000 17.000 12.000 L 18.000 12.000 C 19.105 12.000 20.000 12.895 20.000 14.000 L 20.000 16.000M 18.817 18.826 C 18.567 18.938 18.291 19.000 18.000 19.000 L 17.000 19.000 C 15.895 19.000 15.000 18.105 15.000 17.000 L 15.000 15.000"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _headsetOff!!
    }

private var _headsetOff: ImageVector? = null
