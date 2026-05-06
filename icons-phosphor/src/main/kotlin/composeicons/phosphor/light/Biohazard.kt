package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Biohazard: ImageVector
    get() {
        if (_biohazard != null) return _biohazard!!
        _biohazard = phosphorLightIcon(
            name = "Biohazard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184.35 106.18c-1.166-2.531-2.503-4.98-4-7.33C193.776 70.655 182.468 36.892 154.77 22.47c-1.908-1.058-4.239-.997-6.088 .159-1.85 1.156-2.927 3.224-2.813 5.402 .114 2.178 1.401 4.123 3.361 5.079 19.928 10.376 29.445 33.63 22.51 55-24.167-24.152-63.333-24.152-87.5 0-6.932-21.375 2.594-44.631 22.53-55 2.845-1.577 3.915-5.134 2.412-8.018-1.502-2.885-5.029-4.048-7.952-2.622C73.517 36.889 62.203 70.668 75.64 98.87c-1.499 2.342-2.836 4.785-4 7.31C41.404 108.488 18.037 133.676 18 164c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6 .034-22.087 15.735-41.044 37.43-45.19-7.115 32.532 12.761 64.868 45 73.21C97.899 210.922 71.333 215.588 51.23 202.77c-2.792-1.789-6.506-.977-8.295 1.815-1.789 2.792-.977 6.506 1.815 8.295 13.184 8.422 29.212 11.161 44.445 7.595 15.233-3.566 28.379-13.135 36.455-26.535 .77 0 1.55 .06 2.34 .06 .79 0 1.57 0 2.34-.06 8.076 13.4 21.222 22.969 36.455 26.535 15.233 3.566 31.261 .827 44.445-7.595 2.792-1.789 3.604-5.503 1.815-8.295-1.789-2.792-5.503-3.604-8.295-1.815C184.644 215.578 158.085 210.903 143.56 192c32.239-8.342 52.115-40.678 45-73.21 21.706 4.143 37.415 23.112 37.44 45.21 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6-.038-30.327-23.41-55.516-53.65-57.82ZM128 82c14.678-.003 28.612 6.461 38.09 17.67-8.557 12.643-22.829 20.217-38.095 20.217-15.266 0-29.538-7.574-38.095-20.217C99.379 88.458 113.318 81.993 128 82ZM131.8 131.79c-1.411 2.1-2.681 4.291-3.8 6.56-1.12-2.267-2.386-4.458-3.79-6.56 1.25 .08 2.51 .13 3.78 .13 1.27 0 2.55-.05 3.81-.13ZM78 132c.013-4.678 .686-9.33 2-13.82 23.749 2.102 41.969 21.979 42 45.82 .005 5.867-1.122 11.68-3.32 17.12C95.097 176.617 78.03 156.009 78 132ZM137.32 181.12C135.122 175.68 133.995 169.867 134 164c.031-23.841 18.251-43.718 42-45.82 3.886 13.514 1.902 28.04-5.466 40.018-7.368 11.977-19.439 20.298-33.254 22.922Z"),
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
        return _biohazard!!
    }

private var _biohazard: ImageVector? = null
