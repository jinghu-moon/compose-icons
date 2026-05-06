package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandEye: ImageVector
    get() {
        if (_handEye != null) return _handEye!!
        _handEye = phosphorThinIcon(
            name = "HandEye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 168c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM212 116v36c0 46.392-37.608 84-84 84C81.608 236 44 198.392 44 152v-76c.007-9.461 5.572-18.035 14.21-21.894C66.849 50.247 76.948 51.823 84 58.13v-14.13C84.017 31.108 94.216 20.532 107.099 20.048c12.883-.484 23.847 9.297 24.831 22.152 7.039-6.346 17.153-7.955 25.813-4.108C166.404 41.94 171.99 50.523 172 60v38.13c7.052-6.307 17.151-7.883 25.79-4.024 8.638 3.859 14.203 12.433 14.21 21.894ZM204 116c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16v4c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-60c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16v44c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-60c0-8.837-7.163-16-16-16C99.163 28 92 35.163 92 44v68c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-36C84 67.163 76.837 60 68 60 59.163 60 52 67.163 52 76v76c0 41.974 34.026 76 76 76 41.974 0 76-34.026 76-76ZM179.58 166.21c.564 1.127 .564 2.453 0 3.58C178.88 171.19 162.08 204 128 204 93.92 204 77.12 171.19 76.42 169.79c-.564-1.127-.564-2.453 0-3.58C77.12 164.81 93.92 132 128 132c34.08 0 50.88 32.81 51.58 34.21ZM171.42 168.01c-3.83-6.43-18.55-28-43.42-28-24.87 0-39.6 21.55-43.42 28 3.84 6.44 18.55 28 43.42 28 24.87 0 39.6-21.56 43.42-28.01Z"),
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
        return _handEye!!
    }

private var _handEye: ImageVector? = null
