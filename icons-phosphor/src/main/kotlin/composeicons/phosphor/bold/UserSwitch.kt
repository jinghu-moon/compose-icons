package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) return _userSwitch!!
        _userSwitch = phosphorBoldIcon(
            name = "UserSwitch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213 174.26c-2.585-1.861-5.804-2.619-8.948-2.105-3.144 .514-5.954 2.257-7.812 4.845q-1.47 2.06-3.05 4c-7.19-12.044-17.574-21.863-30-28.37 17.732-19.099 16.984-48.858-1.685-67.042C142.837 67.403 113.069 67.437 94.442 85.664c-18.627 18.227-19.307 47.987-1.532 67.046-12.409 6.499-22.804 16.268-30.06 28.25C52.691 168.504 46.338 153.384 44.55 137.41c4.957 4.235 12.389 3.736 16.736-1.122 4.348-4.858 4.021-12.299-.736-16.758l-20-20C38.298 97.271 35.24 96.001 32.05 96.001c-3.19 0-6.248 1.27-8.5 3.529l-20 20c-4.53 4.681-4.498 12.12 .071 16.763 4.569 4.642 12.007 4.792 16.759 .337 2.294 28.574 15.866 55.059 37.72 73.61 .573 .584 1.203 1.11 1.88 1.57 39.764 32.376 96.829 32.267 136.47-.26 .449-.326 .876-.68 1.28-1.06 6.779-5.72 12.825-12.257 18-19.46 1.866-2.585 2.626-5.805 2.114-8.951-.512-3.146-2.255-5.959-4.844-7.819ZM128 96c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24ZM128 212c-16.733 .02-33.086-4.986-46.94-14.37C89.687 179.531 107.951 168.005 128 168.005c20.049 0 38.313 11.527 46.94 29.625C161.071 206.983 144.728 211.987 128 212ZM252.49 136.49l-20 20c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-20-20c-4.757-4.458-5.084-11.899-.736-16.758 4.348-4.858 11.779-5.357 16.736-1.122C207.627 84.052 182.871 55.447 149.225 46.664 115.579 37.882 80 50.738 59.74 79c-2.444 3.628-6.668 5.638-11.024 5.247-4.356-.391-8.155-3.121-9.915-7.125C37.042 73.117 37.601 68.473 40.26 65 66.689 28.176 113.3 11.773 156.967 23.93c43.666 12.157 75.095 50.287 78.693 95.47 4.752-4.455 12.19-4.305 16.759 .337 4.569 4.642 4.6 12.082 .071 16.763Z"),
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
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
