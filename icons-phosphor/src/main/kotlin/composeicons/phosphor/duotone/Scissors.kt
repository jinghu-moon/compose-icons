package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Scissors: ImageVector
    get() {
        if (_scissors != null) return _scissors!!
        _scissors = phosphorDuotoneIcon(
            name = "Scissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M40.2 95.8C29.266 84.865 29.267 67.137 40.201 56.203c10.935-10.934 28.663-10.934 39.597 0 10.935 10.934 10.935 28.662 .001 39.597-5.251 5.252-12.373 8.202-19.8 8.202-7.427 0-14.549-2.95-19.8-8.202ZM40.2 160.2c-10.934 10.935-10.933 28.663 .001 39.597 10.935 10.934 28.663 10.934 39.597 0 10.935-10.934 10.935-28.662 .001-39.597C74.549 154.948 67.427 151.998 60 151.998c-7.427 0-14.549 2.95-19.8 8.202Z"),
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
                pathData = parseSvgPathData("M157.73 113.13c-1.201-1.752-1.655-3.911-1.263-5.998 .392-2.088 1.598-3.934 3.353-5.132L227.48 55.7c3.641-2.253 8.41-1.239 10.82 2.299 2.411 3.538 1.608 8.347-1.82 10.911l-67.67 46.3c-1.326 .914-2.899 1.403-4.51 1.4-2.629-.01-5.085-1.311-6.57-3.48ZM238.6 198.22c-2.497 3.645-7.475 4.576-11.12 2.08L136 137.7 93.49 166.78c6.715 17.053-.453 36.43-16.651 45.006-16.197 8.576-36.253 3.614-46.583-11.525C19.926 185.122 22.619 164.638 36.511 152.683c13.892-11.955 34.548-11.564 47.979 .907L121.83 128 84.44 102.41c-13.385 12.407-33.953 12.782-47.781 .871C22.831 91.371 20.154 70.974 30.441 55.899 40.727 40.824 60.695 35.879 76.828 44.411c16.133 8.533 23.284 27.821 16.612 44.809l143 97.87c1.766 1.187 2.987 3.028 3.392 5.116 .405 2.089-.038 4.253-1.232 6.014ZM80 180c.002-9.542-6.736-17.756-16.094-19.619-9.358-1.863-18.729 3.143-22.382 11.958-3.653 8.815-.571 18.982 7.362 24.285 7.933 5.302 18.506 4.263 25.254-2.483C77.905 190.4 80.015 185.307 80 180ZM74.14 90.13c5.721-5.719 7.433-14.322 4.338-21.797C75.383 60.859 68.09 55.986 60 55.986c-8.09 0-15.383 4.873-18.478 12.348-3.095 7.474-1.383 16.077 4.338 21.797 3.731 3.787 8.824 5.919 14.14 5.919 5.316 0 10.409-2.132 14.14-5.919Z"),
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
        return _scissors!!
    }

private var _scissors: ImageVector? = null
