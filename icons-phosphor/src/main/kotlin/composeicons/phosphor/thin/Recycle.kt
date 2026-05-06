package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Recycle: ImageVector
    get() {
        if (_recycle != null) return _recycle!!
        _recycle = phosphorThinIcon(
            name = "Recycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 208c0 2.209-1.791 4-4 4h-48c-7.143-.004-13.743-3.817-17.313-10.005C19.117 195.808 19.118 188.186 22.69 182L61.83 114.38l-23.43 6.27c-1.402 .441-2.933 .077-3.987-.947-1.054-1.024-1.462-2.544-1.061-3.958 .4-1.414 1.544-2.495 2.979-2.815l32.77-8.77c1.026-.274 2.12-.129 3.039 .403 .919 .533 1.589 1.409 1.861 2.437l8.79 32.77c.573 2.132-.689 4.325-2.82 4.9-.326 .091-.662 .138-1 .14-1.819-.006-3.405-1.239-3.86-3L68.81 118.34 29.65 186c-2.14 3.706-2.144 8.272-.011 11.982 2.133 3.71 6.081 6.003 10.361 6.018h48c2.209 0 4 1.791 4 4ZM233.28 182 210.14 142c-1.105-1.914-3.551-2.57-5.465-1.465-1.914 1.105-2.57 3.551-1.465 5.465l23.14 40c2.14 3.706 2.144 8.272 .011 11.982-2.133 3.71-6.081 6.003-10.361 6.018h-78.34l17.17-17.17c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0l-24 24c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83l24 24c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L137.66 212h78.34c7.143-.004 13.743-3.817 17.313-10.005 3.57-6.187 3.569-13.809-.003-19.995ZM138.38 34l39.14 67.62L154.09 95.34c-2.135-.572-4.328 .695-4.9 2.83-.572 2.135 .695 4.328 2.83 4.9l32.78 8.78c.325 .093 .662 .14 1 .14 1.819-.006 3.405-1.239 3.86-3l8.79-32.79c.441-1.402 .077-2.933-.947-3.987-1.024-1.054-2.544-1.462-3.958-1.061-1.414 .4-2.495 1.544-2.815 2.979l-6.3 23.47L145.31 30C141.735 23.822 135.138 20.018 128 20.018c-7.138 0-13.735 3.804-17.31 9.982L87.53 70c-1.105 1.914-.449 4.36 1.465 5.465 1.914 1.105 4.36 .449 5.465-1.465L117.61 34c2.145-3.706 6.103-5.987 10.385-5.987 4.282 0 8.24 2.282 10.385 5.987Z"),
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
        return _recycle!!
    }

private var _recycle: ImageVector? = null
