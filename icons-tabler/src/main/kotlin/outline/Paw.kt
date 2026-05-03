package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Paw: ImageVector
    get() {
        if (_paw != null) return _paw!!
        _paw = tablerOutlineIcon(
            name = "Paw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.700 13.500 C 13.600 11.500 13.259 11.000 12.000 11.000 C 10.741 11.000 10.264 11.755 9.164 13.747 C 8.222 15.450 6.318 15.592 5.843 17.038 C 5.746 17.303 5.698 17.715 5.700 18.000 C 5.700 19.176 6.487 20.000 7.500 20.000 C 8.759 20.000 10.500 19.000 12.000 19.000 C 13.500 19.000 15.241 20.000 16.500 20.000 C 17.513 20.000 18.300 19.177 18.300 18.000 C 18.300 17.715 18.251 17.303 18.154 17.038 C 17.679 15.587 15.642 15.203 14.700 13.500"),
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
                pathData = parseSvgPathData("M 20.188 8.082 C 20.060 8.028 19.921 8.000 19.782 8.000 L 19.767 8.000 C 19.032 8.012 18.207 8.750 17.774 9.866 C 17.255 11.201 17.494 12.566 18.312 12.918 C 18.441 12.973 18.579 13.000 18.718 13.000 C 19.457 13.000 20.293 12.258 20.729 11.134 C 21.245 9.799 21.002 8.434 20.189 8.082 L 20.188 8.082"),
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
                pathData = parseSvgPathData("M 9.474 9.000 C 9.529 9.000 9.583 9.000 9.637 8.989 C 10.581 8.861 11.170 7.643 10.957 6.267 C 10.754 4.970 9.910 4.000 9.025 4.000 C 8.970 4.000 8.916 4.000 8.862 4.011 C 7.918 4.139 7.329 5.357 7.542 6.733 C 7.746 8.026 8.590 9.000 9.475 9.000"),
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
                pathData = parseSvgPathData("M 16.456 6.733 C 16.670 5.357 16.081 4.139 15.136 4.011 C 15.082 4.004 15.028 4.000 14.974 4.000 C 14.089 4.000 13.246 4.970 13.044 6.267 C 12.830 7.643 13.419 8.861 14.364 8.989 C 14.418 8.996 14.472 9.000 14.526 9.000 C 15.411 9.000 16.256 8.026 16.456 6.733"),
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
                pathData = parseSvgPathData("M 5.690 12.918 C 6.506 12.566 6.744 11.199 6.226 9.866 C 5.790 8.742 4.955 8.000 4.217 8.000 C 4.077 8.000 3.940 8.027 3.810 8.082 C 2.994 8.434 2.756 9.801 3.274 11.134 C 3.710 12.258 4.545 13.000 5.283 13.000 C 5.423 13.000 5.560 12.973 5.690 12.918"),
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
        return _paw!!
    }

private var _paw: ImageVector? = null
