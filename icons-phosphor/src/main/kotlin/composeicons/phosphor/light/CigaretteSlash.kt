package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CigaretteSlash: ImageVector
    get() {
        if (_cigaretteSlash != null) return _cigaretteSlash!!
        _cigaretteSlash = phosphorLightIcon(
            name = "CigaretteSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06l78.15 86h-89.71c-7.732 0-14 6.268-14 14v32c0 7.732 6.268 14 14 14h144.25l27.31 30c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM30 176v-32c0-1.105 .895-2 2-2h50v36h-50c-1.105 0-2-.895-2-2ZM94 178v-36h38.62l32.73 36ZM238 144v32c0 7.732-6.268 14-14 14h-1.84c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h1.84c1.105 0 2-.895 2-2v-32c0-1.105-.895-2-2-2h-45.48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h45.48c7.732 0 14 6.268 14 14ZM202.77 61.06c7.81-13.88 7.91-21.91 6.62-26.2-.564-2.245-1.972-4.186-3.93-5.42-2.553-1.188-3.937-3.991-3.326-6.741 .61-2.749 3.05-4.704 5.866-4.699 .841-.004 1.673 .174 2.44 .52 4.929 2.524 8.621 6.942 10.23 12.24 3.18 9.58 .68 21.75-7.44 36.18-7.81 13.88-7.91 21.91-6.62 26.2 .551 2.232 1.94 4.166 3.88 5.4 2.57 1.171 3.975 3.975 3.376 6.734-.6 2.759-3.042 4.727-5.866 4.726-.841 .004-1.673-.174-2.44-.52-4.929-2.524-8.621-6.942-10.23-12.24-3.18-9.58-.68-21.75 7.44-36.18ZM162.77 61.06c7.81-13.88 7.91-21.91 6.62-26.2-.564-2.245-1.972-4.186-3.93-5.42-2.553-1.188-3.937-3.991-3.326-6.741 .61-2.749 3.05-4.704 5.866-4.699 .841-.004 1.673 .174 2.44 .52 4.929 2.524 8.621 6.942 10.23 12.24 3.18 9.58 .68 21.75-7.44 36.18-7.81 13.88-7.91 21.91-6.62 26.2 .551 2.232 1.94 4.166 3.88 5.4 2.57 1.171 3.975 3.975 3.376 6.734-.6 2.759-3.042 4.727-5.866 4.726-.841 .004-1.673-.174-2.44-.52-4.929-2.524-8.621-6.942-10.23-12.24-3.18-9.58-.68-21.75 7.44-36.18Z"),
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
        return _cigaretteSlash!!
    }

private var _cigaretteSlash: ImageVector? = null
