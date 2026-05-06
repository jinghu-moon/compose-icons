package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) return _pushPinSlash!!
        _pushPinSlash = phosphorThinIcon(
            name = "PushPinSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L75.35 76c-9.93 .88-22.26 4.54-34.87 14.71-2.662 2.131-4.291 5.293-4.482 8.697-.191 3.404 1.075 6.729 3.482 9.143l51.13 51.13L45.17 205.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L96.29 165.36l51.12 51.12c2.251 2.254 5.305 3.52 8.49 3.52 .28 0 .57 0 .85 0 3.458-.245 6.641-1.973 8.73-4.74 5.884-7.663 10.351-16.315 13.19-25.55l26.37 29c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM159.08 210.42c-.7 .914-1.76 1.482-2.909 1.559-1.149 .077-2.275-.346-3.091-1.159L45.17 102.93c-.821-.806-1.256-1.926-1.192-3.075 .063-1.149 .618-2.215 1.522-2.925C59.58 85.57 73.12 83.43 82.5 83.81l89.69 98.65c-2.12 11.46-8.19 21.46-13.11 27.96ZM232.49 101.17 187.85 146c-1.569 1.499-4.046 1.474-5.584-.056-1.538-1.53-1.576-4.007-.086-5.584L226.83 95.56c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83L166.15 29.17c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173L119.27 70.53c-1.56 1.566-4.094 1.57-5.66 .01-1.566-1.56-1.57-4.094-.01-5.66L154.83 23.52c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529l60.66 60.68c4.686 4.686 4.686 12.284 0 16.97Z"),
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
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
