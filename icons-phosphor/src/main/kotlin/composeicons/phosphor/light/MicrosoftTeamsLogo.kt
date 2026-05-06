package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MicrosoftTeamsLogo: ImageVector
    get() {
        if (_microsoftTeamsLogo != null) return _microsoftTeamsLogo!!
        _microsoftTeamsLogo = phosphorLightIcon(
            name = "MicrosoftTeamsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M82 110h-10c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-10v42c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM230 92.74v59.26c.003 20.22-15.809 36.911-36 38-9.113 24.126-32.21 40.091-58 40.091C110.21 230.091 87.113 214.126 78 190h-38c-7.732 0-14-6.268-14-14v-96C26 72.268 32.268 66 40 66h59.34C94.32 47.423 103.979 28.027 121.829 20.839c17.85-7.188 38.255 .101 47.511 16.971 12.373-6.943 27.918-4.269 37.259 6.409C215.941 54.897 216.526 70.66 208 82h11.28c5.921 .017 10.715 4.819 10.72 10.74ZM173.42 49.45c.386 2.162 .58 4.354 .58 6.55 .002 9.658-3.674 18.955-10.28 26h20.28c7.803 .007 14.722-5.013 17.135-12.434 2.413-7.42-.23-15.55-6.544-20.134-6.315-4.583-14.863-4.577-21.171 .017ZM112 66h24c6.953 .008 12.847 5.118 13.84 12 11.681-7.347 15.587-22.54 8.898-34.611C152.049 31.319 137.096 26.577 124.674 32.587 112.252 38.596 106.688 53.264 112 66ZM40 178h96c1.105 0 2-.895 2-2v-96c0-1.105-.895-2-2-2h-96c-1.105 0-2 .895-2 2v96c0 1.105 .895 2 2 2ZM186 168v-72c0-1.105-.895-2-2-2h-34v82c0 7.732-6.268 14-14 14h-44.9c10.236 20.891 33.529 31.962 56.192 26.709C169.955 211.455 186 191.264 186 168ZM218 94h-20.16c.099 .662 .152 1.33 .16 2v72c-.001 3.167-.241 6.329-.72 9.46C209.348 174.957 218.001 164.325 218 152Z"),
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
