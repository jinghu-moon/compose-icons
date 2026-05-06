package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Exclude: ImageVector
    get() {
        if (_exclude != null) return _exclude!!
        _exclude = phosphorLightIcon(
            name = "Exclude",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172.91 83.09C166.341 43.893 131.35 15.904 91.668 18.102 51.985 20.301 20.301 51.985 18.102 91.668c-2.199 39.683 25.791 74.673 64.988 81.242 6.569 39.197 41.56 67.186 81.242 64.988 39.683-2.199 71.367-33.883 73.565-73.565C240.096 124.65 212.107 89.659 172.91 83.09ZM226 160c-.004 2.977-.211 5.951-.62 8.9L171.62 115.13C173.203 108.877 174.002 102.451 174 96c0-.17 0-.33 0-.49 30.325 6.621 51.958 33.451 52 64.49ZM45.31 53.79l55.5 55.5c-4.898 5.72-8.94 12.12-12 19L34 73.48C36.604 66.313 40.431 59.651 45.31 53.79ZM73.48 34l54.8 54.81c-6.88 3.06-13.28 7.102-19 12L53.78 45.31C59.644 40.43 66.309 36.603 73.48 34ZM94 160c.044-36.433 29.567-65.956 66-66 .65 0 1.3 0 1.95 0 0 .65 .05 1.3 .05 2-.044 36.433-29.567 65.956-66 66-.65 0-1.3 0-2-.05 0-.65 0-1.3 0-1.95ZM146.71 155.19l55.5 55.5c-5.861 4.879-12.523 8.706-19.69 11.31L127.72 167.19c6.877-3.061 13.273-7.103 18.99-12ZM155.19 146.71c4.898-5.72 8.94-12.12 12-19L222 182.52c-2.616 7.17-6.457 13.832-11.35 19.69ZM160.49 82.01h-.49c-6.451-.002-12.877 .797-19.13 2.38L87.1 30.62C90.049 30.211 93.023 30.004 96 30c31.039 .042 57.869 21.675 64.49 52ZM30 96c.004-2.977 .211-5.951 .62-8.9l53.76 53.77C82.797 147.123 81.998 153.549 82 160c0 .17 0 .33 0 .49C51.675 153.869 30.042 127.039 30 96ZM95.51 174h.49c6.451 .002 12.877-.797 19.13-2.38l53.77 53.76c-2.949 .409-5.923 .616-8.9 .62-31.039-.042-57.869-21.675-64.49-52Z"),
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
        return _exclude!!
    }

private var _exclude: ImageVector? = null
