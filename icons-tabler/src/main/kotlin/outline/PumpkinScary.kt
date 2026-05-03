package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PumpkinScary: ImageVector
    get() {
        if (_pumpkinScary != null) return _pumpkinScary!!
        _pumpkinScary = tablerOutlineIcon(
            name = "PumpkinScary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 15.000 L 10.500 16.000 L 12.000 15.000 L 13.500 16.000 L 15.000 15.000"),
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
                pathData = parseSvgPathData("M 10.000 11.000 L 10.010 11.000"),
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
                pathData = parseSvgPathData("M 14.000 11.000 L 14.010 11.000"),
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
                pathData = parseSvgPathData("M 17.000 6.082 C 19.609 6.670 20.627 10.244 19.723 14.065 C 18.820 17.885 16.973 20.505 14.364 19.918 C 14.096 19.857 13.836 19.763 13.590 19.639 C 13.093 19.875 12.550 19.998 12.000 20.000 C 11.444 20.000 10.910 19.873 10.410 19.638 C 10.165 19.763 9.905 19.857 9.636 19.918 C 7.027 20.506 5.180 17.885 4.276 14.065 C 3.373 10.245 4.391 6.670 7.000 6.082 C 8.085 5.838 8.575 6.148 9.585 6.869 C 10.301 6.315 11.125 6.000 12.000 6.000 C 12.876 6.000 13.699 6.315 14.415 6.870 C 15.425 6.148 15.915 5.838 17.000 6.082"),
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
                pathData = parseSvgPathData("M 12.000 6.000 C 12.000 4.774 12.693 3.654 13.789 3.106 L 14.000 3.000"),
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
        return _pumpkinScary!!
    }

private var _pumpkinScary: ImageVector? = null
