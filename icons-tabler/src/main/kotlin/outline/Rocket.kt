package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Rocket: ImageVector
    get() {
        if (_rocket != null) return _rocket!!
        _rocket = tablerOutlineIcon(
            name = "Rocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 13.000 C 7.670 13.436 10.564 16.330 11.000 20.000 C 12.797 18.964 13.932 17.073 14.000 15.000 C 17.434 13.792 19.802 10.635 20.000 7.000 C 20.000 5.343 18.657 4.000 17.000 4.000 C 13.365 4.198 10.208 6.566 9.000 10.000 C 6.927 10.068 5.036 11.203 4.000 13.000"),
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
                pathData = parseSvgPathData("M 7.000 14.000 C 4.871 15.202 3.684 17.576 4.000 20.000 C 6.424 20.316 8.798 19.129 10.000 17.000"),
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
                pathData = parseSvgPathData("M 14.000 9.000 C 14.000 9.552 14.448 10.000 15.000 10.000 C 15.552 10.000 16.000 9.552 16.000 9.000 C 16.000 8.448 15.552 8.000 15.000 8.000 C 14.448 8.000 14.000 8.448 14.000 9.000"),
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
        return _rocket!!
    }

private var _rocket: ImageVector? = null
