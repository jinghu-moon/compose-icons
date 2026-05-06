package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Popcorn: ImageVector
    get() {
        if (_popcorn != null) return _popcorn!!
        _popcorn = phosphorLightIcon(
            name = "Popcorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.14 75.66c-1.54-1.47-3.743-2.014-5.79-1.43l-1.41 .4C218.302 63.112 210.935 53.238 200.645 47.429 190.355 41.621 178.094 40.416 166.87 44.11 160.411 28.329 145.052 18.02 128 18.02c-17.052 0-32.411 10.309-38.87 26.09C77.906 40.416 65.645 41.621 55.355 47.429 45.065 53.238 37.698 63.112 35.06 74.63l-1.41-.4c-2.046-.585-4.249-.042-5.789 1.426-1.54 1.468-2.188 3.642-1.701 5.714L56.71 211.21c1.49 6.323 7.133 10.791 13.63 10.79h115.32c6.497 .001 12.14-4.467 13.63-10.79L229.84 81.37c.485-2.07-.162-4.242-1.7-5.71ZM76 54c4.883-.012 9.694 1.187 14 3.49 1.656 .882 3.629 .939 5.333 .154 1.704-.785 2.942-2.322 3.347-4.154 3.06-13.714 15.229-23.467 29.28-23.467 14.051 0 26.22 9.753 29.28 23.467 .406 1.829 1.643 3.363 3.344 4.148 1.701 .785 3.671 .73 5.326-.148C170.244 55.175 175.086 53.976 180 54c14.236-.004 26.514 9.998 29.39 23.94L168.32 89.67l-35.12-14c-3.338-1.335-7.062-1.335-10.4 0l-35.12 14L46.61 77.94C49.486 63.998 61.764 53.996 76 54ZM161.44 99.84 146.75 210h-37.5L94.56 99.84 127.26 86.76c.475-.189 1.005-.189 1.48 0ZM68.44 208.46 40.18 88.58l42.39 12.11L97.15 210h-26.81c-.929 .002-1.736-.636-1.95-1.54ZM187.66 208.46c-.218 .922-1.053 1.565-2 1.54h-26.81L173.43 100.69 215.82 88.58Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
