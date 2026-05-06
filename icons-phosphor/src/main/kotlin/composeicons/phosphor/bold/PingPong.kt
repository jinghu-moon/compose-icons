package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PingPong: ImageVector
    get() {
        if (_pingPong != null) return _pingPong!!
        _pingPong = phosphorBoldIcon(
            name = "PingPong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.93 195.71c-.472-5.73-3.386-10.98-8-14.41L203 155.17l12.1-12.1c10.372-10.281 14.917-25.068 12.11-39.4C222.375 79.901 209.347 58.584 190.4 43.44 171.182 27.981 147.182 19.693 122.52 20 66.296 20.946 20.946 66.296 20 122.52c-.304 24.651 7.979 48.64 23.43 67.85 15.144 18.947 36.461 31.975 60.23 36.81 14.329 2.807 29.113-1.738 39.39-12.11L155.17 203l26.13 32.95c3.43 4.614 8.68 7.528 14.41 8 .55 0 1.1 .07 1.66 .07 5.3-.004 10.383-2.111 14.13-5.86l26.64-26.64c4.169-4.157 6.289-9.944 5.79-15.81ZM44 122.86C44.6 80 80 44.6 122.86 44c25.36-.317 49.437 11.131 65.2 31L75 188.06C55.131 172.297 43.683 148.22 44 122.86ZM197.71 218 165.61 177.51c-2.128-2.675-5.297-4.316-8.71-4.51h-.69c-3.184-.003-6.238 1.26-8.49 3.51l-21.63 21.59h0c-4.62 4.695-11.279 6.774-17.75 5.54-3.976-.798-7.881-1.911-11.68-3.33L200.31 96.66c1.419 3.799 2.532 7.704 3.33 11.68 1.234 6.471-.845 13.13-5.54 17.75l-21.63 21.63c-2.424 2.416-3.701 5.752-3.51 9.169 .191 3.417 1.832 6.59 4.51 8.721L218 197.71Z"),
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
