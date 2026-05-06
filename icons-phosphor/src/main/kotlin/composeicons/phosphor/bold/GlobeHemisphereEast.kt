package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GlobeHemisphereEast: ImageVector
    get() {
        if (_globeHemisphereEast != null) return _globeHemisphereEast!!
        _globeHemisphereEast = phosphorBoldIcon(
            name = "GlobeHemisphereEast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 44c15.542-.012 30.779 4.31 44 12.48v16L151.79 96l-28.47 3.85L104.62 87.6C100.214 84.525 94.756 83.352 89.476 84.345c-5.28 .993-9.939 4.069-12.926 8.535L55.61 124.18c-2.186 3.254-3.362 7.08-3.38 11l-.16 28.69C39.783 137.853 41.668 107.357 57.065 83.05 72.461 58.744 99.227 44.009 128 44ZM68.41 187.14c4.768-3.773 7.561-9.51 7.59-15.59l.2-35 18.07-27 16.62 10.88c4.114 2.882 9.164 4.103 14.14 3.42l31.47-4.26c4.859-.658 9.308-3.078 12.5-6.8L191.16 87c2.182-2.554 3.692-5.614 4.39-8.9 14.757 19.929 19.928 45.372 14.12 69.48L198.33 137.21c-5.745-5.227-13.99-6.672-21.17-3.71l-30.45 12.66c-6.475 2.713-11.066 8.607-12.11 15.55l-2.39 16.2c-1.486 10.084 4.851 19.673 14.71 22.26l16 4.18c-31.986 14.661-69.725 7.774-94.47-17.24ZM185.18 189.46l-1.63-1.63c-2.511-2.514-5.644-4.315-9.08-5.22l-18-4.72L158 167.48l26-10.81 16 14.59c-4.073 6.724-9.061 12.849-14.82 18.2Z"),
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
        return _globeHemisphereEast!!
    }

private var _globeHemisphereEast: ImageVector? = null
