package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BucketDroplet: ImageVector
    get() {
        if (_bucketDroplet != null) return _bucketDroplet!!
        _bucketDroplet = tablerOutlineIcon(
            name = "BucketDroplet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 16.000 L 6.465 17.638 C 7.193 18.421 7.177 19.637 6.429 20.400 C 5.680 21.164 4.464 21.204 3.667 20.491 C 2.871 19.779 2.775 18.566 3.450 17.737 L 5.000 16.000"),
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
                pathData = parseSvgPathData("M 13.737 9.737 C 16.036 7.437 16.967 4.642 15.818 3.492 C 14.668 2.342 11.873 3.275 9.574 5.574 C 7.274 7.873 6.343 10.669 7.492 11.818 C 8.642 12.968 11.438 12.036 13.737 9.737"),
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
                pathData = parseSvgPathData("M 7.492 11.818 C 7.854 12.180 8.260 12.494 8.700 12.752 L 15.595 16.799 C 16.673 17.356 17.850 16.724 19.287 15.287 C 20.724 13.850 21.357 12.673 20.799 11.595 C 20.427 10.877 19.079 8.578 16.752 4.700 C 16.493 4.259 16.179 3.853 15.818 3.492"),
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
        return _bucketDroplet!!
    }

private var _bucketDroplet: ImageVector? = null
