package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WavesElectricity: ImageVector
    get() {
        if (_wavesElectricity != null) return _wavesElectricity!!
        _wavesElectricity = tablerOutlineIcon(
            name = "WavesElectricity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 12.000 C 3.576 11.357 4.512 10.983 5.500 11.000 C 6.488 10.983 7.424 11.357 8.000 12.000 C 8.576 12.643 9.512 13.017 10.500 13.000 C 11.488 13.017 12.424 12.643 13.000 12.000"),
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
                pathData = parseSvgPathData("M 3.000 16.000 C 3.576 15.357 4.512 14.983 5.500 15.000 C 6.488 14.983 7.424 15.357 8.000 16.000 C 8.576 16.643 9.512 17.017 10.500 17.000 C 11.488 17.017 12.424 16.643 13.000 16.000"),
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
                pathData = parseSvgPathData("M 3.000 8.000 C 3.576 7.357 4.512 6.983 5.500 7.000 C 6.488 6.983 7.424 7.357 8.000 8.000 C 8.576 8.643 9.512 9.017 10.500 9.000 C 11.488 9.017 12.424 8.643 13.000 8.000"),
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
                pathData = parseSvgPathData("M 20.000 7.000 L 17.000 12.000 L 21.000 12.000 L 18.000 17.000"),
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
        return _wavesElectricity!!
    }

private var _wavesElectricity: ImageVector? = null
