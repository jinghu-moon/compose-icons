package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = radixIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.36 1.569c1.012 0 1.819 .48 2.361 1.175 .584-.119 1.133-.333 1.63-.628-.196 .612-.611 1.124-1.151 1.449 0 .001 .001 .002 .001 .003 .53-.064 1.034-.204 1.504-.412l-.001 .002c-.337 .505-.763 .949-1.251 1.313 .026 .177 .043 .354 .043 .531-0 3.686-2.809 7.974-7.975 7.974-1.483 0-2.872-.408-4.062-1.114l-.234-.146-.08-.062c-.167-.162-.202-.425-.071-.628 .013-.021 .028-.04 .044-.058 .074-.122 .202-.205 .347-.217l.091 .002 .24 .023c.834 .063 1.659-.06 2.395-.381C3.464 10.074 2.885 9.48 2.584 8.744L2.502 8.52c-.048-.151-.013-.317 .092-.436 .004-.004 .008-.009 .012-.013C1.965 7.508 1.56 6.682 1.56 5.761v-.033c0-.159 .084-.308 .222-.389 .046-.027 .096-.042 .146-.052C1.707 4.863 1.581 4.381 1.581 3.869c0-.468 .003-1.058 .332-1.589 .073-.118 .192-.189 .319-.207 .159-.051 .337-.02 .47 .088l.072 .071 .233 .272C4.085 3.696 5.565 4.51 7.234 4.737 7.234 4.723 7.233 4.71 7.233 4.696c0-1.727 1.4-3.128 3.127-3.128ZM10.36 2.569C9.186 2.569 8.233 3.521 8.233 4.696c0 .166 .019 .329 .055 .486 .035 .153-.004 .313-.104 .433-.075 .09-.179 .149-.292 .17l-.115 .008C5.709 5.689 3.852 4.798 2.494 3.416c-.01 .136-.013 .285-.013 .453 0 .755 .384 1.422 .969 1.812l.058 .046c.125 .117 .174 .298 .12 .466-.061 .191-.243 .319-.443 .312C2.971 6.499 2.764 6.468 2.563 6.42c.237 .746 .864 1.319 1.643 1.476 .205 .041 .354 .218 .361 .427 .007 .209-.132 .395-.333 .449-.18 .049-.366 .079-.557 .095 .389 .529 1.011 .877 1.715 .89 .19 .003 .358 .126 .419 .307 .061 .181 0 .38-.149 .497-.709 .555-1.531 .893-2.388 1.042 .705 .241 1.46 .373 2.247 .373 4.499-0 6.974-3.717 6.975-6.974 0-1.289-.902-2.432-2.136-2.433Z"),
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
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
