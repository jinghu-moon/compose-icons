package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MicrosoftTeamsLogo: ImageVector
    get() {
        if (_microsoftTeamsLogo != null) return _microsoftTeamsLogo!!
        _microsoftTeamsLogo = phosphorFillIcon(
            name = "MicrosoftTeamsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.26 80h-7.57c2.829-4.857 4.317-10.379 4.31-16 .006-11.008-5.647-21.246-14.966-27.106-9.319-5.86-20.995-6.518-30.914-1.744C159.981 18.599 139.424 11.715 121.363 18.823 103.302 25.93 92.95 44.978 96.81 64h-56.81C31.163 64 24 71.163 24 80v96c0 8.837 7.163 16 16 16h36.67c9.797 24.19 33.302 40.009 59.401 39.976 26.099-.033 49.563-15.91 59.299-40.126C216.078 190.099 231.996 172.782 232 152v-59.26C231.989 85.708 226.292 80.011 219.26 80ZM136 32c10.175-.001 19.245 6.415 22.632 16.009 3.388 9.594 .357 20.282-7.562 26.671C148.816 68.287 142.779 64.008 136 64h-22.62c-2.597-7.344-1.467-15.492 3.029-21.853C120.906 35.785 128.21 32.002 136 32ZM88 160c-4.418 0-8-3.582-8-8v-40h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-8v40c0 4.418-3.582 8-8 8ZM184 168c-.007 21.719-14.597 40.726-35.575 46.348C127.446 219.97 105.307 210.805 94.44 192h41.56c8.837 0 16-7.163 16-16v-80h32ZM184 80h-16c6.362-8.467 9.096-19.116 7.6-29.6 5.772-3.577 13.174-3.121 18.463 1.138 5.289 4.259 7.314 11.393 5.05 17.796C196.85 75.736 190.791 80.012 184 80ZM216 152c-.001 10.31-6.586 19.468-16.36 22.75 .241-2.242 .361-4.495 .36-6.75v-72h16Z"),
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
