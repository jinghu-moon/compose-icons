package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MicrosoftTeamsLogo: ImageVector
    get() {
        if (_microsoftTeamsLogo != null) return _microsoftTeamsLogo!!
        _microsoftTeamsLogo = phosphorDuotoneIcon(
            name = "MicrosoftTeamsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 80v96c0 4.418-3.582 8-8 8h-96c-4.418 0-8-3.582-8-8v-96c0-4.418 3.582-8 8-8h96c4.418 0 8 3.582 8 8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M80 152v-40h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-8v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM232 92.74v59.26c-.004 20.782-15.922 38.099-36.63 39.85-9.736 24.215-33.2 40.093-59.299 40.126C109.972 232.009 86.467 216.19 76.67 192h-36.67c-8.837 0-16-7.163-16-16v-96C24 71.163 31.163 64 40 64h56.81C92.95 44.978 103.302 25.93 121.363 18.823c18.061-7.108 38.619-.224 48.757 16.327 12.652-6.081 27.789-3.206 37.331 7.089 9.542 10.295 11.261 25.607 4.239 37.761h7.57c7.032 .011 12.729 5.708 12.74 12.74ZM175.6 50.4C177.096 60.884 174.362 71.533 168 80h16c6.791 .012 12.85-4.264 15.113-10.666 2.264-6.403 .239-13.537-5.05-17.796-5.289-4.259-12.691-4.715-18.463-1.138ZM113.38 64h22.62c6.779 .008 12.816 4.287 15.07 10.68 9.505-7.663 11.741-21.241 5.197-31.548C149.723 32.825 136.484 29.074 125.505 34.415 114.527 39.757 109.308 52.49 113.38 64ZM40 176h96v-96h-96ZM184 168v-72h-32v80c0 8.837-7.163 16-16 16h-41.56c10.867 18.805 33.006 27.97 53.985 22.348C169.403 208.726 183.993 189.719 184 168ZM216 96h-16v72c.001 2.255-.119 4.508-.36 6.75C209.414 171.468 215.999 162.31 216 152Z"),
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
        return _microsoftTeamsLogo!!
    }

private var _microsoftTeamsLogo: ImageVector? = null
