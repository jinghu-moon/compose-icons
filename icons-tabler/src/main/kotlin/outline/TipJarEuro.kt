package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TipJarEuro: ImageVector
    get() {
        if (_tipJarEuro != null) return _tipJarEuro!!
        _tipJarEuro = tablerOutlineIcon(
            name = "TipJarEuro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 4.000 L 17.000 5.882 C 17.000 6.567 17.387 7.194 18.000 7.500 C 18.613 7.806 19.000 8.433 19.000 9.118 L 19.000 18.000 C 19.000 19.657 17.657 21.000 16.000 21.000 L 8.000 21.000 C 6.343 21.000 5.000 19.657 5.000 18.000 L 5.000 9.118 C 5.000 8.433 5.387 7.806 6.000 7.500 C 6.613 7.194 7.000 6.567 7.000 5.882 L 7.000 4.000"),
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
                pathData = parseSvgPathData("M 6.000 4.000 L 18.000 4.000 L 6.000 4.000"),
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
                pathData = parseSvgPathData("M 12.000 13.000 L 9.000 13.000"),
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
                pathData = parseSvgPathData("M 14.000 10.172 C 12.757 9.732 11.372 10.155 10.587 11.216 C 9.803 12.276 9.803 13.724 10.587 14.784 C 11.372 15.845 12.757 16.268 14.000 15.828"),
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
        return _tipJarEuro!!
    }

private var _tipJarEuro: ImageVector? = null
