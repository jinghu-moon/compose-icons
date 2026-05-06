package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BellRinging: ImageVector
    get() {
        if (_bellRinging != null) return _bellRinging!!
        _bellRinging = tablerFilledIcon(
            name = "BellRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.451 2.344c.362-.416 .993-.461 1.41-.099 1.293 1.123 2.332 2.508 3.048 4.064 .231 .502 .011 1.096-.491 1.327-.502 .231-1.096 .011-1.327-.491C19.495 5.847 18.629 4.692 17.551 3.755c-.417-.362-.461-.993-.1-1.41Z")
            addPathData("M5.136 2.245c.417-.362 1.049-.318 1.411 .099 .362 .417 .318 1.049-.099 1.411C5.37 4.692 4.504 5.847 3.908 7.145c-.145 .331-.458 .558-.817 .594-.36 .036-.711-.126-.918-.422C1.965 7.021 1.934 6.636 2.091 6.31 2.806 4.754 3.844 3.368 5.136 2.245Z")
            addPathData("M14.235 19c.865 0 1.322 1.024 .745 1.668C14.222 21.516 13.138 22.001 12 22c-1.138 .001-2.222-.484-2.98-1.332-.552-.616-.158-1.579 .634-1.661l.11-.006h4.471Z")
            addPathData("M12 2c1.358 0 2.506 .903 2.875 2.141l.046 .171 .008 .043c2.236 1.262 3.732 3.518 4.024 6.069l.028 .287L19 11v2.931l.021 .136c.137 .737 .545 1.396 1.143 1.847l.167 .117 .162 .099c.86 .487 .56 1.766-.377 1.864L20 18h-16C2.972 18 2.613 16.636 3.507 16.13c.771-.436 1.31-1.192 1.472-2.063L5 13.924l.001-2.97C5.125 8.302 6.556 5.884 8.822 4.5l.248-.146 .01-.043C9.37 3.086 10.392 2.172 11.642 2.021l.182-.017L12 2Z")
        }
        return _bellRinging!!
    }

private var _bellRinging: ImageVector? = null
