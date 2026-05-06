package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Component2: ImageVector
    get() {
        if (_component2 != null) return _component2!!
        _component2 = radixIcon(
            name = "Component2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.664 1.003c.171 .003 .324 .008 .462 .02 .281 .023 .54 .072 .782 .195l.138 .077c.313 .192 .569 .468 .736 .797 .124 .243 .172 .501 .195 .782C14 3.149 14 3.489 14 3.9v7.199c0 .412 0 .751-.023 1.026-.017 .211-.049 .408-.116 .597l-.079 .186c-.168 .329-.423 .605-.736 .797l-.138 .077c-.243 .124-.501 .172-.782 .195C11.851 14 11.511 14 11.1 14h-7.199c-.412 0-.751 0-1.026-.023-.281-.023-.54-.072-.782-.195-.329-.168-.605-.423-.797-.736l-.077-.138c-.124-.243-.172-.501-.195-.782-.011-.138-.017-.291-.02-.462L1 11.1v-7.199C1 3.489 1 3.149 1.022 2.874c.023-.281 .072-.54 .195-.782 .192-.376 .498-.682 .874-.874 .243-.124 .501-.172 .782-.195C3.149 1 3.489 1 3.9 1h7.199l.564 .003ZM2 8v3.1l.003 .549c.002 .155 .006 .284 .016 .396 .018 .219 .051 .331 .091 .409l.082 .134c.092 .127 .213 .231 .354 .303 .078 .04 .19 .073 .409 .091 .225 .018 .517 .019 .945 .019h3.1v-5h-5ZM8 8v5h3.1c.428 0 .72-0 .945-.019 .219-.018 .331-.051 .409-.091l.134-.082c.127-.092 .231-.213 .303-.355l.028-.066c.027-.075 .049-.179 .062-.343 .018-.225 .019-.517 .019-.945v-3.1h-5ZM3.9 2c-.428 0-.72 0-.945 .019-.219 .018-.331 .051-.409 .091-.188 .096-.341 .249-.437 .437-.04 .078-.073 .19-.091 .409C2 3.18 2 3.472 2 3.9v3.1h5v-5h-3.1ZM8 7h5v-3.1c0-.428-0-.72-.019-.945-.018-.219-.051-.331-.091-.409-.072-.141-.176-.262-.303-.354l-.134-.082c-.078-.04-.19-.073-.409-.091-.113-.009-.242-.013-.396-.016L11.1 2h-3.1v5Z"),
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
        return _component2!!
    }

private var _component2: ImageVector? = null
