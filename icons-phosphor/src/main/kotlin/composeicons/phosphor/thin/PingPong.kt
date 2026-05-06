package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PingPong: ImageVector
    get() {
        if (_pingPong != null) return _pingPong!!
        _pingPong = phosphorThinIcon(
            name = "PingPong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 196.36c-.296-3.516-2.125-6.724-5-8.77L189.13 157.7l20.29-20.29c8.475-8.395 12.194-20.471 9.91-32.18-4.469-21.931-16.503-41.593-34-55.55C167.573 35.408 145.41 27.745 122.63 28 70.741 28.892 28.892 70.741 28 122.63c-.282 22.789 7.38 44.966 21.67 62.72 13.957 17.497 33.619 29.531 55.55 34 11.711 2.285 23.788-1.438 32.18-9.92l20.29-20.28L187.59 231c2.048 2.878 5.26 4.707 8.78 5 .33 0 .66 0 1 0 3.182-.003 6.232-1.269 8.48-3.52l26.64-26.64c2.509-2.489 3.793-5.957 3.51-9.48ZM56 180.36C42.838 164.062 35.766 143.688 36 122.74 36.818 75.174 75.184 36.812 122.75 36c20.925-.253 41.286 6.782 57.59 19.9 8.562 6.888 15.777 15.299 21.28 24.81L80.72 201.62C71.206 196.116 62.794 188.898 55.91 180.33ZM226.92 200.21l-26.65 26.65c-.86 .857-2.063 1.276-3.27 1.14-1.178-.087-2.255-.7-2.93-1.67L161.43 180.64c-.683-.955-1.75-1.562-2.92-1.66h-.33c-1.061-.001-2.079 .42-2.83 1.17l-23.63 23.63h0c-6.512 6.601-15.899 9.5-25 7.72-6.412-1.273-12.653-3.286-18.6-6L205.47 88.18c2.714 5.947 4.727 12.188 6 18.6 1.774 9.1-1.123 18.485-7.72 25l-23.63 23.63c-.831 .831-1.254 1.985-1.158 3.156 .096 1.171 .702 2.24 1.658 2.924l45.69 32.64c.957 .682 1.565 1.751 1.663 2.922 .098 1.171-.323 2.326-1.153 3.158Z"),
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
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
