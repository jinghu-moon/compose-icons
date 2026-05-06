package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ReadCvLogo: ImageVector
    get() {
        if (_readCvLogo != null) return _readCvLogo!!
        _readCvLogo = phosphorLightIcon(
            name = "ReadCvLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.43 41.22 80.18 18.22C72.578 16.901 65.341 21.982 64 29.58L34.25 198.58c-.645 3.657 .189 7.421 2.32 10.463 2.131 3.042 5.382 5.113 9.04 5.757l130.25 23h0c.812 .148 1.635 .221 2.46 .22 6.763-.055 12.521-4.936 13.68-11.6l29.75-169c1.333-7.596-3.729-14.84-11.32-16.2ZM210 55.36l-29.75 169c-.089 .525-.384 .993-.82 1.3-.434 .303-.969 .421-1.49 .33L47.65 203c-.536-.085-1.015-.384-1.326-.829-.311-.445-.428-.998-.324-1.531l29.75-169c.089-.525 .384-.993 .82-1.3 .445-.31 .995-.433 1.53-.34L208.35 53c.536 .085 1.015 .384 1.326 .829 .311 .445 .428 .998 .324 1.531ZM186.11 75.51c-.487 2.881-2.978 4.992-5.9 5-.352-0-.703-.03-1.05-.09l-83-14.66c-2.169-.311-3.995-1.778-4.766-3.829-.771-2.051-.362-4.358 1.065-6.02 1.427-1.662 3.647-2.413 5.791-1.961l83 14.65c3.242 .579 5.411 3.663 4.86 6.91ZM180.56 107c-.487 2.881-2.978 4.992-5.9 5-.336-.003-.67-.036-1-.1l-83-14.65c-3.264-.577-5.442-3.691-4.865-6.955 .577-3.264 3.691-5.442 6.955-4.865l83 14.66c3.221 .603 5.363 3.68 4.81 6.91ZM133.56 131.19c-.509 2.865-3 4.951-5.91 4.95-.352-.001-.703-.031-1.05-.09L85.11 128.72c-2.169-.311-3.995-1.778-4.766-3.829-.771-2.051-.362-4.358 1.065-6.02 1.427-1.662 3.647-2.413 5.791-1.961l41.49 7.32c1.57 .282 2.964 1.178 3.872 2.49 .908 1.312 1.257 2.931 .968 4.5Z"),
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
        return _readCvLogo!!
    }

private var _readCvLogo: ImageVector? = null
