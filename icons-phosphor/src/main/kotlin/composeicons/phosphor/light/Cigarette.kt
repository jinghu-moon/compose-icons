package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cigarette: ImageVector
    get() {
        if (_cigarette != null) return _cigarette!!
        _cigarette = phosphorLightIcon(
            name = "Cigarette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 130h-192c-7.732 0-14 6.268-14 14v32c0 7.732 6.268 14 14 14h192c7.732 0 14-6.268 14-14v-32c0-7.732-6.268-14-14-14ZM30 176v-32c0-1.105 .895-2 2-2h50v36h-50c-1.105 0-2-.895-2-2ZM226 176c0 1.105-.895 2-2 2h-130v-36h130c1.105 0 2 .895 2 2ZM202.77 61.06c7.81-13.88 7.91-21.91 6.62-26.2-.564-2.245-1.972-4.186-3.93-5.42-2.553-1.188-3.937-3.991-3.326-6.741 .61-2.749 3.05-4.704 5.866-4.699 .841-.004 1.673 .174 2.44 .52 4.929 2.524 8.621 6.942 10.23 12.24 3.18 9.58 .68 21.75-7.44 36.18-7.81 13.88-7.91 21.91-6.62 26.2 .551 2.232 1.94 4.166 3.88 5.4 2.57 1.171 3.975 3.975 3.376 6.734-.6 2.759-3.042 4.727-5.866 4.726-.841 .004-1.673-.174-2.44-.52-4.929-2.524-8.621-6.942-10.23-12.24-3.18-9.58-.68-21.75 7.44-36.18ZM162.77 61.06c7.81-13.88 7.91-21.91 6.62-26.2-.564-2.245-1.972-4.186-3.93-5.42-2.553-1.188-3.937-3.991-3.326-6.741 .61-2.749 3.05-4.704 5.866-4.699 .841-.004 1.673 .174 2.44 .52 4.929 2.524 8.621 6.942 10.23 12.24 3.18 9.58 .68 21.75-7.44 36.18-7.81 13.88-7.91 21.91-6.62 26.2 .551 2.232 1.94 4.166 3.88 5.4 2.57 1.171 3.975 3.975 3.376 6.734-.6 2.759-3.042 4.727-5.866 4.726-.841 .004-1.673-.174-2.44-.52-4.929-2.524-8.621-6.942-10.23-12.24-3.18-9.58-.68-21.75 7.44-36.18Z"),
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
        return _cigarette!!
    }

private var _cigarette: ImageVector? = null
