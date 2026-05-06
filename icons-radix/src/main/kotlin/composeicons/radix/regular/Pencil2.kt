package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Pencil2: ImageVector
    get() {
        if (_pencil2 != null) return _pencil2!!
        _pencil2 = radixIcon(
            name = "Pencil2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 3h-4.1c-.428 0-.72 0-.945 .019-.219 .018-.331 .051-.409 .091-.188 .096-.341 .249-.437 .437-.04 .078-.073 .19-.091 .409-.018 .225-.019 .517-.019 .945v6.199c0 .428 0 .72 .019 .945 .018 .219 .051 .331 .091 .409l.082 .134c.092 .127 .213 .231 .354 .303l.066 .028c.075 .027 .179 .049 .343 .062 .225 .018 .517 .019 .945 .019h6.199c.428 0 .72-0 .945-.019 .219-.018 .331-.051 .409-.091l.134-.082c.127-.092 .231-.214 .303-.355l.028-.066c.027-.075 .049-.179 .062-.343 .018-.225 .018-.517 .018-.945v-4.1l1-1v5.1c0 .412 0 .751-.022 1.026-.017 .211-.049 .408-.116 .597l-.079 .186c-.168 .329-.423 .605-.736 .797l-.138 .077c-.243 .124-.501 .172-.782 .195C11.851 14 11.511 14 11.099 14h-6.199c-.412 0-.751 0-1.026-.023-.211-.017-.409-.049-.597-.116l-.186-.079c-.329-.168-.605-.423-.797-.736l-.077-.138c-.124-.243-.172-.501-.195-.782-.022-.275-.022-.615-.022-1.026v-6.199c0-.412-0-.751 .022-1.026 .023-.281 .072-.54 .195-.782 .192-.376 .498-.682 .874-.874 .243-.124 .501-.172 .782-.195 .275-.022 .615-.022 1.026-.022h5.1l-1 1ZM12.224 1.082c.194-.128 .458-.106 .629 .064l2 2 .064 .078c.128 .194 .106 .458-.064 .629L10.911 7.796c-.076 .076-.164 .139-.26 .188L6.724 9.947c-.192 .096-.425 .058-.577-.094C5.994 9.701 5.956 9.469 6.053 9.276L8.017 5.349c.048-.096 .112-.184 .188-.26L12.146 1.147l.078-.064ZM8.911 5.796 7.872 7.872l.255 .255L10.204 7.089 13.793 3.5 12.5 2.207 8.911 5.796Z"),
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
        return _pencil2!!
    }

private var _pencil2: ImageVector? = null
