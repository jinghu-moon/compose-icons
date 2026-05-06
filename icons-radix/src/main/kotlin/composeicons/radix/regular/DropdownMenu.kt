package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DropdownMenu: ImageVector
    get() {
        if (_dropdownMenu != null) return _dropdownMenu!!
        _dropdownMenu = radixIcon(
            name = "DropdownMenu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.581 11.109c.182 .038 .319 .199 .319 .392-0 .193-.137 .354-.319 .392l-.081 .009h-7c-.221 0-.4-.18-.4-.4 0-.221 .179-.4 .4-.4h7l.081 .009ZM14.581 9.109c.182 .038 .319 .198 .319 .392-0 .193-.137 .354-.319 .392l-.081 .009h-7c-.221 0-.4-.18-.4-.4 0-.221 .179-.4 .4-.4h7l.081 .009ZM2.5 9.25 0 6h5L2.5 9.25ZM14.581 7.109c.182 .038 .319 .199 .319 .392-0 .193-.137 .354-.319 .392l-.081 .009h-7c-.221 0-.4-.18-.4-.4 0-.221 .179-.4 .4-.4h7l.081 .009ZM14.581 5.109c.182 .038 .319 .199 .319 .392-0 .193-.137 .354-.319 .392l-.081 .009h-7c-.221 0-.4-.18-.4-.4 0-.221 .179-.4 .4-.4h7l.081 .009ZM14.581 3.109c.182 .038 .319 .198 .319 .392-0 .193-.137 .354-.319 .392l-.081 .009h-7c-.221 0-.4-.18-.4-.4 0-.221 .179-.4 .4-.4h7l.081 .009Z"),
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
        return _dropdownMenu!!
    }

private var _dropdownMenu: ImageVector? = null
