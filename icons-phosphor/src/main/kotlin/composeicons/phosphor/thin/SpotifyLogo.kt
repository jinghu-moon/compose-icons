package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) return _spotifyLogo!!
        _spotifyLogo = phosphorThinIcon(
            name = "SpotifyLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM155.54 167.87c-.495 .94-1.344 1.644-2.359 1.957-1.015 .313-2.113 .21-3.051-.287-13.818-7.43-30.442-7.43-44.26 0-.578 .301-1.219 .458-1.87 .46-1.841 .004-3.447-1.25-3.89-3.037-.443-1.787 .391-3.646 2.02-4.503 16.187-8.55 35.553-8.55 51.74 0 .94 .495 1.644 1.344 1.957 2.359 .313 1.015 .21 2.113-.287 3.051ZM187.54 111.87c-1.039 1.949-3.46 2.688-5.41 1.65-33.81-18.1-74.43-18.1-108.24 0-1.944 .993-4.324 .244-5.35-1.682-1.026-1.926-.318-4.319 1.59-5.378 36.16-19.355 79.6-19.355 115.76 0 1.946 1.042 2.679 3.463 1.64 5.41ZM171.54 139.87c-1.039 1.949-3.46 2.688-5.41 1.65-23.825-12.708-52.415-12.708-76.24 0-1.944 .993-4.324 .244-5.35-1.682-1.026-1.926-.318-4.319 1.59-5.378 26.175-13.959 57.585-13.959 83.76 0 .937 .5 1.637 1.353 1.944 2.37 .308 1.017 .198 2.114-.304 3.05Z"),
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
        return _spotifyLogo!!
    }

private var _spotifyLogo: ImageVector? = null
