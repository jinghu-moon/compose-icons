package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = phosphorThinIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 140c-2.096-.003-4.186 .205-6.24 .62l-34-101.88C171.221 37.117 169.71 36.016 168 36h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h29.12l19 57.14L126.12 172h-50.12C75.967 155.111 62.815 141.155 45.957 140.122 29.1 139.089 14.342 151.335 12.247 168.093c-2.095 16.759 9.195 32.26 25.788 35.408C54.628 206.65 70.811 196.361 75 180h53c1.197-0 2.33-.536 3.09-1.46l56.06-68.43 11 33c-14.708 7.006-21.805 23.943-16.484 39.341 5.321 15.398 21.361 24.34 37.256 20.771 15.895-3.569 26.572-18.511 24.799-34.705C241.948 152.322 228.291 140.045 212 140ZM44 196C30.745 196 20 185.255 20 172c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM212 196c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _scooter!!
    }

private var _scooter: ImageVector? = null
