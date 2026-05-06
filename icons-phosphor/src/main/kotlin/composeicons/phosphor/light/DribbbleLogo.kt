package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DribbbleLogo: ImageVector
    get() {
        if (_dribbbleLogo != null) return _dribbbleLogo!!
        _dribbbleLogo = phosphorLightIcon(
            name = "DribbbleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM217.81 122.3c-3.26-.19-6.54-.3-9.8-.3-15.301 .007-30.527 2.123-45.25 6.29C159.126 117.039 154.288 106.213 148.33 96c-.14-.25-.3-.49-.44-.74 15.308-8.988 29.079-20.369 40.79-33.71 17.227 15.701 27.673 37.487 29.13 60.75ZM179.29 54.09C168.393 66.411 155.599 76.913 141.39 85.2 129.894 68.629 115.492 54.277 98.88 42.84c27.066-9.262 56.925-5.084 80.41 11.25ZM85.71 48.58c17.683 10.93 32.986 25.305 45 42.27C109.894 100.847 87.092 106.025 64 106c-7.644-.006-15.278-.571-22.84-1.69C47.738 80.409 63.845 60.26 85.71 48.58ZM38 128c-0-3.986 .263-7.968 .79-11.92 8.343 1.275 16.77 1.917 25.21 1.92 25.41 .028 50.487-5.788 73.29-17 .22 .37 .46 .73 .67 1.1 5.523 9.456 10.009 19.481 13.38 29.9-9.033 3.267-17.763 7.32-26.09 12.11-22.35 12.894-41.409 30.792-55.68 52.29C49.534 179.326 37.994 154.324 38 128ZM79.19 203.58c13.288-20.204 31.111-37.024 52.05-49.12 7.471-4.296 15.293-7.952 23.38-10.93 2.855 11.841 4.299 23.979 4.3 36.16-0 11.483-1.278 22.93-3.81 34.13-25.567 8.082-53.408 4.327-75.92-10.24ZM168.43 208.39c1.656-9.477 2.489-19.079 2.49-28.7-.007-13.437-1.639-26.825-4.86-39.87C179.707 135.966 193.819 134.007 208 134c3.25 0 6.52 .11 9.77 .32-2.265 31.653-21.004 59.784-49.34 74.07Z"),
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
        return _dribbbleLogo!!
    }

private var _dribbbleLogo: ImageVector? = null
