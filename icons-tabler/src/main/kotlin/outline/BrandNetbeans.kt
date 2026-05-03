package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNetbeans: ImageVector
    get() {
        if (_brandNetbeans != null) return _brandNetbeans!!
        _brandNetbeans = tablerOutlineIcon(
            name = "BrandNetbeans",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.875 6.270 C 20.575 6.668 21.005 7.413 21.000 8.218 L 21.000 15.502 C 21.000 16.311 20.557 17.057 19.842 17.450 L 13.092 21.720 C 12.412 22.093 11.588 22.093 10.908 21.720 L 4.158 17.450 C 3.445 17.061 3.002 16.314 3.000 15.502 L 3.000 8.217 C 3.000 7.408 3.443 6.663 4.158 6.270 L 10.908 2.290 C 11.608 1.904 12.458 1.904 13.158 2.290 L 19.908 6.270 L 19.875 6.270"),
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
                pathData = parseSvgPathData("M 15.500 9.430 C 15.812 9.610 16.003 9.944 16.000 10.304 L 16.000 13.572 C 16.000 13.935 15.803 14.270 15.485 14.446 L 12.485 16.363 C 12.183 16.530 11.817 16.530 11.515 16.363 L 8.515 14.446 C 8.198 14.270 8.001 13.936 8.000 13.573 L 8.000 10.304 C 8.000 9.941 8.197 9.606 8.514 9.430 L 11.514 7.644 C 11.825 7.471 12.204 7.471 12.514 7.644 L 15.514 9.431 L 15.500 9.431 L 15.500 9.430"),
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
                pathData = parseSvgPathData("M 12.000 21.000 L 12.000 12.000 L 4.500 7.500"),
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
                pathData = parseSvgPathData("M 12.000 12.000 L 19.500 7.500"),
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
                pathData = parseSvgPathData("M 12.000 3.000 L 12.000 7.500"),
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
                pathData = parseSvgPathData("M 19.500 16.000 L 16.000 14.000"),
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
                pathData = parseSvgPathData("M 8.000 14.000 L 4.500 16.000"),
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
        return _brandNetbeans!!
    }

private var _brandNetbeans: ImageVector? = null
