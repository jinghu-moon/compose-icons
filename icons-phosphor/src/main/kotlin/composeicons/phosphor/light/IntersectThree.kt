package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.IntersectThree: ImageVector
    get() {
        if (_intersectThree != null) return _intersectThree!!
        _intersectThree = phosphorLightIcon(
            name = "IntersectThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M193.78 97.13C193.91 95.44 194 93.73 194 92 194 55.549 164.451 26 128 26 91.549 26 62 55.549 62 92c0 1.73 .09 3.44 .22 5.13C40.2 108.035 26.061 130.271 25.526 154.837c-.535 24.567 12.622 47.397 34.147 59.25 21.525 11.854 47.852 10.768 68.328-2.818 20.475 13.586 46.803 14.671 68.328 2.818 21.525-11.854 34.682-34.684 34.147-59.25-.535-24.567-14.674-46.802-36.694-57.707ZM74 92C74 62.177 98.177 38 128 38c29.823 0 54 24.177 54 54 0 .17 0 .34 0 .51-18.34-5.22-38.044-2.221-54 8.22C112.044 90.289 92.34 87.29 74 92.51c0-.17 0-.34 0-.51ZM146 156c.004 15.356-6.544 29.984-18 40.21C116.544 185.984 109.996 171.356 110 156c0-.17 0-.34 0-.51 11.766 3.35 24.234 3.35 36 0 0 .17 0 .34 0 .51ZM128 146c-5.602 .004-11.169-.87-16.5-2.59 2.571-10.667 8.326-20.3 16.5-27.62 8.174 7.32 13.929 16.953 16.5 27.62-5.331 1.72-10.898 2.594-16.5 2.59ZM100.4 138.39C87.892 130.931 78.916 118.747 75.5 104.59c14.129-4.542 29.506-3.051 42.5 4.12-8.391 8.16-14.465 18.403-17.6 29.68ZM138 108.71c13.002-7.18 28.392-8.671 42.53-4.12-3.416 14.157-12.392 26.341-24.9 33.8C152.487 127.109 146.402 116.867 138 108.71ZM92 210C67.705 209.982 46.412 193.741 39.972 170.315c-6.441-23.426 3.556-48.269 24.428-60.705 4.997 17.883 17.266 32.85 33.82 41.26C98.09 152.56 98 154.27 98 156c-.012 17.821 7.204 34.885 20 47.29-7.958 4.405-16.905 6.714-26 6.71ZM164 210c-9.095 .004-18.042-2.305-26-6.71C150.796 190.885 158.012 173.821 158 156c0-1.73-.09-3.44-.22-5.13 16.554-8.41 28.823-23.377 33.82-41.26 20.872 12.436 30.869 37.279 24.428 60.705C209.588 193.741 188.295 209.982 164 210Z"),
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
        return _intersectThree!!
    }

private var _intersectThree: ImageVector? = null
