package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BucketOff: ImageVector
    get() {
        if (_bucketOff != null) return _bucketOff!!
        _bucketOff = tablerOutlineIcon(
            name = "BucketOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.029 5.036 C 4.374 5.616 4.000 6.286 4.000 7.000 C 4.000 9.033 7.033 10.712 10.960 10.967M 14.748 10.757 C 17.812 10.198 20.000 8.728 20.000 7.000 C 20.000 4.790 16.418 3.000 12.000 3.000 C 10.395 3.000 8.900 3.236 7.648 3.643"),
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
                pathData = parseSvgPathData("M 4.000 7.000 C 4.000 7.664 4.088 8.324 4.263 8.965 L 7.000 19.000 C 7.500 20.500 9.239 21.000 12.000 21.000 C 14.761 21.000 16.500 20.500 17.000 19.000 C 17.100 18.700 17.252 18.188 17.457 17.465M 18.319 14.319 C 18.581 13.344 19.054 11.559 19.737 8.965 C 19.912 8.325 20.000 7.664 20.000 7.000"),
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
        return _bucketOff!!
    }

private var _bucketOff: ImageVector? = null
