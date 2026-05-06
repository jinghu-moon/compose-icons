package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Clover: ImageVector
    get() {
        if (_clover != null) return _clover!!
        _clover = tablerFilledIcon(
            name = "Clover",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.712 13.297l3.398 3.442c1.187 1.208 1.187 3.143 0 4.351-1.082 1.102-2.817 1.218-4.036 .27l-.075-.062-.073 .062c-.479 .373-1.058 .593-1.664 .634l-.203 .007c-.816 0-1.598-.328-2.17-.91C6.701 19.882 6.702 17.944 7.891 16.737l3.397-3.44c.188-.191 .444-.298 .712-.298 .268 0 .524 .107 .712 .298M21.09 7.89c1.102 1.082 1.219 2.818 .27 4.037L21.298 12l.062 .075c.373 .479 .593 1.058 .634 1.664l.007 .203c0 .816-.328 1.598-.91 2.17-1.209 1.188-3.147 1.187-4.354-.002L13.297 12.713c-.191-.188-.298-.444-.298-.712 0-.268 .107-.524 .298-.712L16.74 7.89c1.208-1.187 3.143-1.187 4.351 0M7.264 7.892l3.44 3.397c.191 .188 .298 .444 .298 .712 0 .268-.107 .524-.298 .712L7.26 16.11c-1.208 1.187-3.143 1.187-4.351 0C1.807 15.028 1.691 13.293 2.639 12.074l.062-.075-.062-.073c-.373-.479-.593-1.058-.634-1.664l-.007-.203c0-.816 .328-1.598 .91-2.17C4.117 6.701 6.055 6.702 7.262 7.891M13.94 2c.816-0 1.598 .328 2.17 .91 1.188 1.209 1.187 3.147-.002 4.354l-3.397 3.44c-.188 .191-.444 .298-.712 .298-.268 0-.524-.107-.712-.298L7.89 7.26C6.703 6.052 6.703 4.117 7.89 2.909 8.972 1.807 10.707 1.691 11.926 2.639l.073 .062 .075-.062c.479-.373 1.058-.593 1.664-.634Z"),
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
        return _clover!!
    }

private var _clover: ImageVector? = null
