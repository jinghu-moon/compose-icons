package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.MagicWand: ImageVector
    get() {
        if (_magicWand != null) return _magicWand!!
        _magicWand = radixIcon(
            name = "MagicWand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.224 5.082c.194-.128 .458-.106 .629 .064 .171 .171 .193 .435 .064 .629l-.064 .078L2.853 12.854c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707l7-7 .078-.064ZM13.5 5.1c.221 0 .4 .179 .4 .4v.6h.6l.081 .009c.182 .038 .319 .199 .319 .392-0 .193-.137 .354-.319 .392l-.081 .009h-.6v.6c-0 .221-.18 .4-.4 .4-.221-0-.4-.18-.4-.4v-.6h-.6c-.221-0-.4-.18-.4-.4 0-.221 .18-.4 .4-.4h.6v-.6c0-.221 .18-.4 .4-.4ZM11.224 3.082c.194-.128 .458-.106 .629 .064 .171 .171 .193 .435 .064 .629l-.064 .078-1 1c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707l1-1 .078-.064ZM8.5 .1c.221 0 .4 .179 .4 .4v.6h.6l.081 .009c.182 .038 .319 .199 .319 .392-0 .193-.137 .354-.319 .392l-.081 .009h-.6v.6c-0 .221-.18 .4-.4 .4C8.279 2.901 8.1 2.721 8.099 2.5v-.6h-.6C7.279 1.901 7.1 1.721 7.099 1.5c0-.221 .179-.4 .4-.4h.6v-.6c0-.221 .179-.4 .4-.4ZM13.5 .1c.221 0 .4 .179 .4 .4v.6h.6l.081 .009c.182 .038 .319 .199 .319 .392-0 .193-.137 .354-.319 .392l-.081 .009h-.6v.6c-0 .221-.18 .4-.4 .4-.221-0-.4-.18-.4-.4v-.6h-.6c-.221-0-.4-.18-.4-.4 0-.221 .18-.4 .4-.4h.6v-.6c0-.221 .18-.4 .4-.4Z"),
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
        return _magicWand!!
    }

private var _magicWand: ImageVector? = null
