package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MicrosoftPowerpointLogo: ImageVector
    get() {
        if (_microsoftPowerpointLogo != null) return _microsoftPowerpointLogo!!
        _microsoftPowerpointLogo = phosphorFillIcon(
            name = "MicrosoftPowerpointLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 24C103.976 24.042 73.746 38.788 54 64h-14C31.163 64 24 71.163 24 80v96c0 8.837 7.163 16 16 16h14c29.94 38.349 82.466 50.816 126.446 30.013 43.98-20.804 67.66-69.319 57.005-116.79C226.795 57.751 184.652 24.011 136 24ZM72 152v-48c0-4.418 3.582-8 8-8h16c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24h-8v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM128 215.63C108.398 213.807 89.967 205.491 75.63 192h52.37ZM128 64h-52.37C89.967 50.509 108.398 42.193 128 40.37ZM144 40.37c42.252 3.912 75.718 37.378 79.63 79.63h-63.63v-40c0-8.837-7.163-16-16-16ZM144 215.63v-23.63c8.837 0 16-7.163 16-16v-40h63.63c-3.912 42.252-37.378 75.718-79.63 79.63ZM96 128h-8v-16h8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _microsoftPowerpointLogo!!
    }

private var _microsoftPowerpointLogo: ImageVector? = null
